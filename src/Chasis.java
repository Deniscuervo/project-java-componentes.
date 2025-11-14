public class Chasis {

    private String tipo;
    private double largo;
    private double peso;

    public Chasis(String tipo, double largo, double peso) {
        this.tipo = tipo;
        this.largo = largo;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Chasis:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Largo: " + largo + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}
