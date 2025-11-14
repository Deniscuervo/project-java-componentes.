public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("VH001", "Toyota", "Corolla");
        Motor m = new Motor("Gasolina", 1800, 140);
        Transmision t = new Transmision("Automática", 6, "4x2");

        v.mostrarInfo();
        m.mostrarInfo();
        t.mostrarInfo();
    }
}
