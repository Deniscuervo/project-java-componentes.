public class Mantenimiento {

    private String descripcion;
    private String fecha;

    public Mantenimiento(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void mostrarInfo() {
        System.out.println("Mantenimiento:");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
    }
}
