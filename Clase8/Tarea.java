public class Tarea {
    private final String id;
    private final String descripcion;
    private final int prioridad; // 1=baja, 2=media, 3=alta
    private final long tiempoLlegada;
    private boolean completada = false;
    private long tiempoProcesamiento = -1L;

    public Tarea(String id, String descripcion, int prioridad) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("id requerido");
        if (prioridad < 1 || prioridad > 3)
            throw new IllegalArgumentException("prioridad inválida");
        this.id = id;
        this.descripcion = descripcion == null ? "" : descripcion;
        this.prioridad = prioridad;
        this.tiempoLlegada = System.currentTimeMillis();
    }

    // getters y setters mínimos
    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    public boolean isCompletada() {
        return completada;
    }

    public long getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void marcarCompletada(long tiempoProcesamiento) {
        this.completada = true;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id='" + id + '\'' +
                ", desc='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", llegada=" + tiempoLlegada +
                ", completada=" + completada +
                ", proc=" + tiempoProcesamiento +
                '}';
    }
}
