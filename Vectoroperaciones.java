package Vector;
import java.util.*;
public class Vectoroperaciones {
    public static List<Integer> vec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los elementos del vector separados por espacio: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        List<Integer> vector = new ArrayList<>();
        for (String s : inputArray) {
            vector.add(Integer.valueOf(s));
        }
        return vector;
    }
    public static void mayor(List<Integer> vector) {
        int mayor = Collections.max(vector);
        int posicion = vector.indexOf(mayor);
        System.out.println("Elemento mayor: " + mayor + ", en la posicion: " + posicion);
    }
    public static void div(List<Integer> vector) {
        double promedio = vector.stream().mapToInt(Integer::intValue).average().orElse(0);
        List<Integer> menoresIguales = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();
        for (int x : vector) {
            if (x <= promedio) {
                menoresIguales.add(x);
            } else {
                mayores.add(x);
            }
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Elementos menor y/o igual al promedio: " + menoresIguales);
        System.out.println("Elementos mayor al promedio: " + mayores);
    }
    public static void rep(List<Integer> vector) {
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> vistos = new HashSet<>();
        for (int i : vector) {
            if (vistos.contains(i)) {
                repetidos.add(i);
            } else {
                vistos.add(i);
            }
        }
        System.out.println("Elementos repetidos: " + new ArrayList<>(repetidos));
    }
    public static void pares(List<Integer> vector) {
        List<Integer> pares = new ArrayList<>();
        for (int x : vector) {
            if (x % 2 == 0) {
                pares.add(x);
            }
        }
        System.out.println("Elementos pares: " + pares);
    }
}