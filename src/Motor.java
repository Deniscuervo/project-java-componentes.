public class Motor {

    private String tipo;
    private int cilindrada;
    private int potencia;

    public Motor(String tipo, int cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public void mostrarInfo() {
        System.out.println("Motor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia + " HP");
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}
