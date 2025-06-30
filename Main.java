package banco2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la persona:");
        System.out.print("Número de identidad: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = scanner.nextLine();
        System.out.print("Número de teléfono: ");
        long telefono = scanner.nextLong();
        System.out.print("Número de celular: ");
        long celular = scanner.nextLong();
        scanner.nextLine();
        System.out.print("\n¿Cuántos préstamos desea solicitar? ");
        int cantidadPrestamos = scanner.nextInt();
        scanner.nextLine();
        double totalPrestamos = 0;
        Prestamo[] prestamos = new Prestamo[cantidadPrestamos];
        for (int i = 0; i < cantidadPrestamos; i++) {
            System.out.println("\nPréstamo " + (i + 1));
            int diaPrestamo;
            do {
                System.out.print("Ingrese el día de inicio del préstamo (1-20 de junio): ");
                diaPrestamo = scanner.nextInt();
                if (diaPrestamo < 1 || diaPrestamo > 20) {
                    System.out.println("Error: La fecha debe estar entre el 1 y el 20 de junio.");
                }
            } while (diaPrestamo < 1 || diaPrestamo > 20);
            double valor;
            do {
                System.out.print("EL BACNO SOLO PRESTARA UN TOTAL $10.000.000\n");
                System.out.print("Ingrese el monto del préstamo: ");
                valor = scanner.nextDouble();
                if (totalPrestamos + valor > 10000000) {
                    System.out.println("Error: El monto total de los préstamos no puede superar 10,000,000.");
                }
            } while (totalPrestamos + valor > 10000000);

            totalPrestamos += valor;
            prestamos[i] = new Prestamo(i + 1, valor, diaPrestamo, 10000000, id, nombre, apellido1, apellido2, telefono, celular);
        }
        Persona persona = new Persona(id, nombre, apellido1, apellido2, telefono, celular);
        persona.mostrarPersona();
        System.out.println("\n----------- Detalles de los préstamos realizados -----------");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarPrestamo();
        }
        scanner.close();
    }
}