package banco2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Prestamo extends Persona {
    private final int NumPrestamos;
    private final double Valor;
    private final String Fecha, FechaAuto, FechaPago, FechaLim;
    private final int MaxValor;
    public Prestamo(int NumPrestamos, double Valor, int diaPrestamo, int maxValor, String ID, String Nombre, String Apellido1, String Apellido2, long Telefono, long Celular){
        super(ID, Nombre, Apellido1, Apellido2, Telefono, Celular);
        this.NumPrestamos = NumPrestamos;
        this.Valor = Valor;
        this.Fecha = calcularFecha(diaPrestamo, 0);
        this.FechaAuto = calcularFecha(diaPrestamo, 7);
        this.FechaPago = calcularFecha(diaPrestamo + 7, 30);
        this.FechaLim = calcularFecha(diaPrestamo + 7, 180);
        this.MaxValor = maxValor;
    }
    public void mostrarPrestamo() {
        System.out.println("\n----------- Datos del Préstamo -----------");
        System.out.println("Número de préstamo: " + NumPrestamos);
        System.out.println("Monto del préstamo: " + Valor);
        System.out.println("Fecha: " + Fecha);
        System.out.println("Fecha de Autorización: " + FechaAuto);
        System.out.println("Fecha de Pago: " + FechaPago);
        System.out.println("Fecha Límite: " + FechaLim);
    }
    private static String calcularFecha(int dia, int incrementoDias) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, 5);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.add(Calendar.DAY_OF_MONTH, incrementoDias);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(calendario.getTime());
    }
}