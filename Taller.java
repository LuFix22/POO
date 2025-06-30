package com.mycompany.taller;
import java.util.*;
public class Taller {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Que codigo desea revisar: \n 1.Cajero \n 2.Triangulo \n 3.Promedios y porcentajes universidad \n 4.Votaciones club \n 5.MOLINA CORPORATION \n 6.Subsidio por hijos \n 7.Promedio colegio \n 8.Registro características clientes \n 9.Serie de Taylor");
            int taller = sc.nextInt();
            sc.nextLine();
            
            switch (taller) {
                case 1 -> {
                    System.out.println("EJERCICIO #1 - CAJERO:");
                    int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
                OUTER:
                while (true) {
                    System.out.println("1.Retiro \n 2.Consignación \n 3.Resumen del día\n Que movimiento desea hacer:");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1 -> {
                            System.out.println("\nQue cantidad de dinero desea retirar:");
                            int b = sc.nextInt();
                            System.out.println("Retiro exitoso");
                            a1 += b;
                            a3++;
                            }
                        case 2 -> {
                            System.out.println("\nQue cantidad desea consignar:");
                            int c = sc.nextInt();
                            System.out.println("Consignación exitosa");
                            a2 += c;
                            a4++;
                            }
                        case 3 -> {
                            break OUTER;
                            }
                        default -> System.out.println("Opción inválida");
                    }
                }
                    System.out.println("\nResumen del día:");
                    System.out.printf("Se efectuó %d retiro(s) que suma un valor total de $%d\n", a3, a1);
                    System.out.printf("Se efectuó %d consignación(es) que suma un valor total de $%d\n", a4, a2);
                    if (a3 == a4) {
                        System.out.printf("Se realizó la misma cantidad de retiros que de consignaciones durante el día, es decir %d\n", a3);
                    } else if (a3 > a4) {
                        System.out.println("Se realizaron más retiros que consignaciones durante el día");
                    } else {
                        System.out.println("Se realizaron más consignaciones que retiros durante el día");
                        System.out.printf("La diferencia entre ambas acciones fue por un valor total de $%d\n", a2 - a1);
                    }
                }
                    
                case 2 -> {
                    System.out.println("EJERCICIO #2 - TRIANGULO");
                    System.out.print("Medida del primer lado: ");
                    int lado1 = sc.nextInt();
                    System.out.print("Medida del segundo lado: ");
                    int lado2 = sc.nextInt();
                    System.out.print("Medida del tercer lado: ");
                    int lado3 = sc.nextInt();
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("Es un triángulo equilátero");
                    } else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
                        System.out.println("Es un triángulo isósceles");
                    } else {
                        int max = Math.max(lado1, Math.max(lado2, lado3));
                        int suma = lado1 + lado2 + lado3 - max;
                        if (suma > max) {
                            System.out.println("Es un triángulo escaleno");
                        } else {
                            System.out.println("La figura no es un triángulo válido");
                        }
                    }
                }
                    
                case 3 -> {
                    System.out.println("EJERCICIO #3 - PROMEDIOS Y PORCENTAJES UNIVERSIDAD");
                    int totalEstudiantes = 0, edadNoIng = 0, cantNoIng = 0, hombresIng = 0;
                    int mujeresMenores20 = 0, mujeresIngEdad = 0, mujeresIng = 0;
                    int hombresMayoresNoIngNocturno = 0;
                    while (true) {
                        System.out.println("Desea ingresar información de un estudiante: \n 1.Sí \n 2.No");
                        int opcion = sc.nextInt();
                        if (opcion == 2) break;
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        System.out.print("Sexo (1.Masculino, 2.Femenino): ");
                        int sexo = sc.nextInt();
                        System.out.print("Carrera (1.Ingeniería, 2.Otra): ");
                        int carrera = sc.nextInt();
                        System.out.print("Jornada (1.Diurna, 2.Nocturna): ");
                        int jornada = sc.nextInt();
                        totalEstudiantes++;
                        if (carrera == 2) {
                            edadNoIng += edad;
                            cantNoIng++;
                        }
                        if (sexo == 1 && carrera == 1) hombresIng++;
                        if (sexo == 2 && edad < 20) mujeresMenores20++;
                        if (sexo == 2 && carrera == 1) {
                            mujeresIng++;
                            mujeresIngEdad += edad;
                        }
                        if (edad > 22 && sexo == 1 && carrera == 2 && jornada == 2) hombresMayoresNoIngNocturno++;
                    }
                    System.out.println("Cantidad de estudiantes registrados: " + totalEstudiantes);
                    System.out.println("Promedio de edad (no ingeniería): " + (cantNoIng > 0 ? edadNoIng / cantNoIng : 0));
                    System.out.println("% Hombres en ingeniería: " + (totalEstudiantes > 0 ? hombresIng * 100 / totalEstudiantes : 0));
                    System.out.println("% Mujeres < 20 años: " + (totalEstudiantes > 0 ? mujeresMenores20 * 100 / totalEstudiantes : 0));
                    System.out.println("Promedio edad mujeres en ingeniería: " + (mujeresIng > 0 ? mujeresIngEdad / mujeresIng : 0));
                    System.out.println("% Hombres >22 no ingeniería nocturno: " + (totalEstudiantes > 0 ? hombresMayoresNoIngNocturno * 100 / totalEstudiantes : 0));
                }
                    
                case 4 -> {
                    System.out.println("EJERCICIO #4 - VOTACIONES CLUB");
                    System.out.print("Número de votos por Juan: ");
                    int j = sc.nextInt();
                    System.out.print("Número de votos por Pedro: ");
                    int p = sc.nextInt();
                    System.out.print("Número de votos por María: ");
                    int m = sc.nextInt();
                    int sv = j + p + m;
                    int nv2 = (sv / 2) + 1;
                    if (j == p && p == m) {
                        System.out.println("Ocurrió un triple empate, se anulan las elecciones.");
                    } else if ((j > p && j > m && p == m) || (p > j && p > m && j == m) || (m > p && m > j && p == j)) {
                        System.out.println("Se anulan las votaciones por empate en segundo lugar.");
                    } else if (j >= nv2) {
                        System.out.printf("Juan ganó la votación con %d votos\n", j);
                    } else if (p >= nv2) {
                        System.out.printf("Pedro ganó la votación con %d votos\n", p);
                    } else if (m >= nv2) {
                        System.out.printf("María ganó la votación con %d votos\n", m);
                    } else {
                        System.out.println("No hay ganador claro, se debe realizar segunda ronda.");
                        if (j < p && j < m) {
                            System.out.println("Ronda entre Pedro y María");
                            System.out.print("Votos Pedro: ");
                            p = sc.nextInt();
                            System.out.print("Votos María: ");
                            m = sc.nextInt();
                            if (p == m) {
                                System.out.println("Empate en segunda ronda.");
                            } else if (p > m) {
                                System.out.println("Pedro gana la segunda ronda");
                            } else {
                                System.out.println("María gana la segunda ronda");
                            }
                        } else if (p < j && p < m) {
                            System.out.println("Ronda entre Juan y María");
                            System.out.print("Votos Juan: ");
                            j = sc.nextInt();
                            System.out.print("Votos María: ");
                            m = sc.nextInt();
                            if (j == m) {
                                System.out.println("Empate en segunda ronda.");
                            } else if (j > m) {
                                System.out.println("Juan gana la segunda ronda");
                            } else {
                                System.out.println("María gana la segunda ronda");
                            }
                        } else {
                            System.out.println("Ronda entre Pedro y Juan");
                            System.out.print("Votos Pedro: ");
                            p = sc.nextInt();
                            System.out.print("Votos Juan: ");
                            j = sc.nextInt();
                            if (p == j) {
                                System.out.println("Empate en segunda ronda.");
                            } else if (p > j) {
                                System.out.println("Pedro gana la segunda ronda");
                            } else {
                                System.out.println("Juan gana la segunda ronda");
                            }
                        }
                    }
                }
                    
                case 5 -> {
                    System.out.println("EJERCICIO #5 - MOLINA CORPORATION");
                    System.out.print("Valor de la tarifa: $");
                    double tarifa = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = sc.nextLine();
                    
                    double salarioBruto;
                    if (horas < 240) {
                        salarioBruto = tarifa;
                    } else if (horas < 300) {
                        salarioBruto = tarifa + tarifa * 2.5;
                    } else {
                        salarioBruto = tarifa + tarifa * 1.7;
                    }
                    
                    double retencion = 0;
                    if (salarioBruto >= 900000 && salarioBruto < 1200000) {
                        retencion = salarioBruto * 0.05;
                    } else if (salarioBruto >= 1200000 && salarioBruto < 2000000) {
                        retencion = salarioBruto * 0.10;
                    } else if (salarioBruto >= 2000000) {
                        retencion = salarioBruto * 0.20;
                    }
                    double salarioNeto = salarioBruto - retencion;
                    
                    System.out.printf("\nCódigo: %d\nNombre: %s\nSexo: %s\nSalario Bruto: $%.2f\nRetención: $%.2f\nSalario Neto: $%.2f\n",
                            codigo, nombre, sexo, salarioBruto, retencion, salarioNeto);
                }
                    
                case 6 -> {
                    System.out.println("EJERCICIO #6 - SUBSIDIO POR HIJOS");
                    System.out.print("Código: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Número de hijos: ");
                    int hijos = sc.nextInt();
                    System.out.print("Salario por hora: ");
                    double salHora = sc.nextDouble();
                    System.out.print("Horas trabajadas al mes: ");
                    int hrs = sc.nextInt();
                    double salario = salHora * hrs;
                    double sub = 17200 * hijos;
                    double ret = 0;
                    
                    if (salario < 428000) {
                        if (hijos <= 6) {
                            ret = salario * 0.04;
                        } else if (hijos <= 12) {
                            ret = (12 - hijos) / 2.0 * salario / 100;
                        }
                    } else {
                        if (hijos < 5) {
                            ret = salario * 0.05;
                        } else if (hijos < 10) {
                            ret = (10.0 / hijos) * salario / 100;
                        }
                    }
                    
                    double total = salario - ret + sub;
                    System.out.printf("\nCódigo: %d\nNombre: %s\nDevengado: $%.2f\nRetención: $%.2f\nSubsidio: $%.2f\nTotal a pagar: $%.2f\n",
                            cod, nom, salario - ret, ret, sub, total);
                }
                    
                case 7 -> {
                    System.out.println("EJERCICIO #7 - PROMEDIO COLEGIO");
                    System.out.print("Número de cursos: ");
                    int numCursos = sc.nextInt();
                    System.out.print("Número de alumnos por curso: ");
                    int numAlumnos = sc.nextInt();
                    System.out.print("Número de materias por alumno: ");
                    int numMaterias = sc.nextInt();
                    
                    ArrayList<Double> promediosAlumnos = new ArrayList<>();
                    ArrayList<Double> promediosCursos = new ArrayList<>();
                    double totalPromedios = 0;
                    
                    for (int i = 0; i < numCursos; i++) {
                        System.out.printf("\nCurso número %d\n", i + 1);
                        double sumaPromCurso = 0;
                        
                        for (int j = 0; j < numAlumnos; j++) {
                            System.out.printf("  Alumno número %d\n", j + 1);
                            double sumaPromAlumno = 0;
                            
                            for (int k = 0; k < numMaterias; k++) {
                                System.out.printf("    Materia número %d\n", k + 1);
                                System.out.print("      Nota 1: ");
                                double n1 = sc.nextDouble();
                                System.out.print("      Nota 2: ");
                                double n2 = sc.nextDouble();
                                System.out.print("      Nota 3: ");
                                double n3 = sc.nextDouble();
                                double promMateria = (n1 + n2 + n3) / 3.0;
                                sumaPromAlumno += promMateria;
                            }
                            double promAlumno = sumaPromAlumno / numMaterias;
                            promediosAlumnos.add(promAlumno);
                            sumaPromCurso += promAlumno;
                        }
                        double promCurso = sumaPromCurso / numAlumnos;
                        promediosCursos.add(promCurso);
                        totalPromedios += promCurso;
                    }
                    
                    System.out.println("\nResultados:");
                    System.out.println("Promedios por alumno: " + promediosAlumnos);
                    System.out.println("Promedios por curso: " + promediosCursos);
                    System.out.printf("Promedio del grado: %.2f\n", totalPromedios / numCursos);
                }
                case 8 -> {
                    System.out.println("EJERCICIO #8 - REGISTRO CARACTERÍSTICAS CLIENTES");
                    ArrayList<String> mujeres = new ArrayList<>();
                    ArrayList<String> hombres = new ArrayList<>();   
                    while (true) {
                        System.out.print("¿Desea ingresar información de un cliente? \n 1.Sí \n 2.No\n --> ");
                        int resp = sc.nextInt();
                        if (resp == 2) break;
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreC = sc.nextLine();
                        System.out.print("Sexo (1.Mujer, 2.Hombre): ");
                        int sexoC = sc.nextInt();
                        System.out.print("Altura en metros: ");
                        double altura = sc.nextDouble();
                        System.out.print("Peso en libras: ");
                        int peso = sc.nextInt();
                        System.out.print("Color de ojos (1.Azules, 2.Castaños, 3.Otro): ");
                        int ojos = sc.nextInt();
                        System.out.print("Color de cabello (1.Castaño, 2.Rubio, 3.Otro): ");
                        int cabello = sc.nextInt();
                        if (sexoC == 1 && ojos == 1 && cabello == 2 && altura >= 1.65 && altura <= 1.75 && peso < 120) {
                            mujeres.add(nombreC);
                        } else if (sexoC == 2 && ojos == 2 && altura > 1.70 && peso >= 180 && peso <= 220) {
                            hombres.add(nombreC);
                        }
                    }
                    System.out.println("\nMujeres que cumplen las características: " + mujeres);
                    System.out.println("Hombres que cumplen las características: " + hombres);
                }
                case 9 -> {
                    System.out.println("EJERCICIO #9 - SERIE DE TAYLOR");
                    System.out.print("Ingresa el valor de x: ");
                    double x = sc.nextDouble();
                    System.out.print("Ingresa el número de términos: ");
                    int n = sc.nextInt();
                    
                    double resultado = 0;
                    for (int i = 0; i < n; i++) {
                        resultado += Math.pow(x, i) / factorial(i);
                    }
                    System.out.printf("e^%.2f ≈ %.5f\n", x, resultado);
                }
                    
                default -> System.out.println("Opción inválida.");
            }
        }
    }
    public static long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}