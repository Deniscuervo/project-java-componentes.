public class Neumatico {

    private String marca;
    private int tamaño;
    private double presion;

    public Neumatico(String marca, int tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    public void mostrarInfo() {
        System.out.println("Neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presión: " + presion + " PSI");
    }
}
