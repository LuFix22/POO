package banco2;
public class Persona {
    private String ID, Nombre, Apellido1, Apellido2;
    private long Telefono, Celular;
    public Persona(String ID, String Nombre, String Apellido1, String Apellido2, long Telefono, long Celular) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = (Telefono);
        this.Celular = (Celular);
    }
    public void mostrarPersona() {
        StringBuilder sb = new StringBuilder("\n---------- Datos del usuario ----------\n");
        sb.append("Número de identidad: ").append(ID).append("\n");
        sb.append("Nombre: ").append(Nombre).append(" ").append(Apellido1).append(" ").append(Apellido2).append("\n");
        sb.append("Número de teléfono: ").append(Telefono).append("\n");
        sb.append("Número de celular: ").append(Celular).append("\n");
        System.out.println(sb.toString());
    }
    public String getID() { return ID; }
    public String getNombre() { return Nombre; }
    public String getApellido1() { return Apellido1; }
    public String getApellido2() { return Apellido2; }
    public long getTelefono() { return Telefono; }
    public long getCelular() { return Celular; }
}