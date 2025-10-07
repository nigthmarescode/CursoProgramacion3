public class Registro {
    private final String estado; // p.ej. "Completada"
    private final long tiempoProcesamiento;
    private final long tiempoLlegada;

    public Registro(String estado, long tiempoProcesamiento, long tiempoLlegada) {
        this.estado = estado;
        this.tiempoProcesamiento = tiempoProcesamiento;
        this.tiempoLlegada = tiempoLlegada;
    }

    public String getEstado() {
        return estado;
    }

    public long getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "estado='" + estado + '\'' +
                ", tiempoProcesamiento=" + tiempoProcesamiento +
                ", tiempoLlegada=" + tiempoLlegada +
                '}';
    }
}
