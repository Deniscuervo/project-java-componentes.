public class Vehiculo {

    private String id;
    private String marca;
    private String modelo;

    public Vehiculo(String id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo:");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
