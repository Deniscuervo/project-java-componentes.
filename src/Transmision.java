public class Transmision {

    private String tipo;
    private int marchas;
    private String traccion;

    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    public void mostrarInfo() {
        System.out.println("Transmisión:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
    }

    // Getters y Setters
}
