public class SistemaFrenos {

    private String tipo;
    private boolean abs;
    private int discos;

    public SistemaFrenos(String tipo, boolean abs, int discos) {
        this.tipo = tipo;
        this.abs = abs;
        this.discos = discos;
    }

    public void mostrarInfo() {
        System.out.println("Sistema de Frenos:");
        System.out.println("Tipo: " + tipo);
        System.out.println("ABS: " + abs);
        System.out.println("Discos: " + discos);
    }
}
