public class SistemaElectrico {

    private int capacidadBateria;
    private boolean lucesLed;
    private int sensores;

    public SistemaElectrico(int capacidadBateria, boolean lucesLed, int sensores) {
        this.capacidadBateria = capacidadBateria;
        this.lucesLed = lucesLed;
        this.sensores = sensores;
    }

    public void mostrarInfo() {
        System.out.println("Sistema Eléctrico:");
        System.out.println("Capacidad bateria: " + capacidadBateria + " Ah");
        System.out.println("Luces LED: " + lucesLed);
        System.out.println("Cantidad sensores: " + sensores);
    }
}
