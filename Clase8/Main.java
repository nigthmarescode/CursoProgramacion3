public class Main {
    public static void main(String[] args) throws InterruptedException {
        GestorTareas gestor = new GestorTareas();

        // Agrego tareas
        gestor.agregarTarea(new Tarea("T1", "Reporte diario", 2)); // en cola
        gestor.agregarTarea(new Tarea("T2", "Incidente crítico", 3)); // pila prioritaria
        gestor.agregarTarea(new Tarea("T3", "Actualización menor", 1)); // en cola

        System.out.println("Pendientes cola: " + gestor.pendientesEnCola());
        System.out.println("Pendientes pila: " + gestor.enPilaPrioritaria());

        // Procesar: T2 debe salir primero (prioridad 3 en pila)
        Tarea p1 = gestor.procesarSiguienteTarea();
        System.out.println("Procesada: " + p1);

        // Consultas
        System.out.println("Estado T2: " + gestor.consultarEstadoTarea("T2"));
        System.out.println("Estado T1: " + gestor.consultarEstadoTarea("T1"));
        System.out.println("Estado TX: " + gestor.consultarEstadoTarea("TX")); // no existe

        // Procesar el resto
        Tarea p2 = gestor.procesarSiguienteTarea();
        System.out.println("Procesada: " + p2);
        Tarea p3 = gestor.procesarSiguienteTarea();
        System.out.println("Procesada: " + p3);

        // Cuando no hay tareas
        Tarea nada = gestor.procesarSiguienteTarea();
        System.out.println("Procesar cuando vacío -> " + nada); // null
    }
}
