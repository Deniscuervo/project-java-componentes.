import java.time.LocalDate;

public class RegistroVehicular {

    private String matricula;
    private String propietario;
    private LocalDate fechaRegistro;

    public RegistroVehicular(String matricula, String propietario, LocalDate fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    public void mostrarInfo() {
        System.out.println("Registro Vehicular:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha registro: " + fechaRegistro);
    }
}
