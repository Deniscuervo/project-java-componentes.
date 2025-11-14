public class Sensor {

    private String tipo;
    private double valor;

    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void mostrarInfo() {
        System.out.println("Sensor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor registrado: " + valor);
    }
}
