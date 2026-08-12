

public class Prestamo {
    String idPrestamo;
    String rutEstudiante;
    String fechaPrestamo;
    boolean devuelto;

    public Prestamo(String idPrestamo, String rutEstudiante, String fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.rutEstudiante = rutEstudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.devuelto = false;
    }

    public void registrarDevolucion() {
        this.devuelto = true;
    }

    public boolean esVencido(String fechaActual) {
        return false;
    }

    public void consultarEstado() {
        System.out.println("Estado de devolución: " + devuelto);
    }
}