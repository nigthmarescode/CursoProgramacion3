import java.util.*;

public class GestorTareas {
    private final Queue<Tarea> cola;
    private final Deque<Tarea> pilaPrioritaria;
    private final Map<String, Registro> trazabilidad;

    public GestorTareas() {
        this.cola = new ArrayDeque<>(); // FIFO
        this.pilaPrioritaria = new ArrayDeque<>(); // LIFO via push/pop
        this.trazabilidad = new HashMap<>();
    }

    // 4.1 agregarTarea
    public void agregarTarea(Tarea tarea) {
        if (tarea == null)
            throw new IllegalArgumentException("tarea null");
        // Si ya existe en trazabilidad => ya procesada
        if (trazabilidad.containsKey(tarea.getId())) {
            throw new IllegalArgumentException("ID ya procesado: " + tarea.getId());
        }
        // También se podría chequear duplicados en cola/pila (opcional)
        if (tarea.getPrioridad() == 3) {
            pilaPrioritaria.push(tarea);
        } else {
            cola.offer(tarea);
        }
    }

    // 4.2 procesarSiguienteTarea
    public Tarea procesarSiguienteTarea() {
        Tarea siguiente = null;
        if (!pilaPrioritaria.isEmpty()) {
            siguiente = pilaPrioritaria.pop();
        } else {
            siguiente = cola.poll();
        }

        if (siguiente == null) {
            return null; // según enunciado se puede retornar null
        }

        long tProc = System.currentTimeMillis();
        siguiente.marcarCompletada(tProc);
        Registro reg = new Registro("Completada", tProc, siguiente.getTiempoLlegada());
        trazabilidad.put(siguiente.getId(), reg);
        return siguiente;
    }

    // 4.3 consultarEstadoTarea
    public String consultarEstadoTarea(String idTarea) {
        if (idTarea == null)
            return "ID no encontrado";
        if (trazabilidad.containsKey(idTarea)) {
            Registro r = trazabilidad.get(idTarea);
            return "Completada (procesada en ts=" + r.getTiempoProcesamiento() + ")";
        }
        for (Tarea t : pilaPrioritaria) {
            if (t.getId().equals(idTarea))
                return "Pendiente (Prioritaria)";
        }
        for (Tarea t : cola) {
            if (t.getId().equals(idTarea))
                return "Pendiente (En cola)";
        }
        return "ID no encontrado";
    }

    // Métodos auxiliares para tests / inspección
    public int pendientesEnCola() {
        return cola.size();
    }

    public int enPilaPrioritaria() {
        return pilaPrioritaria.size();
    }

    public Map<String, Registro> getTrazabilidad() {
        return Collections.unmodifiableMap(trazabilidad);
    }
}
