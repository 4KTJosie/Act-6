import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculadorageometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                List<String> resultados = new ArrayList<>();
                boolean continuar = true;

                while (continuar) {
                    try {
                        System.out.println("Seleccione la figura geométrica:");
                        System.out.println("1. Círculo");
                        System.out.println("2. Cuadrado");
                        System.out.println("3. Triángulo");
                        System.out.println("4. Rectángulo");
                        System.out.println("5. Pentágono");
                        int figura = scanner.nextInt();

                        System.out.println("Seleccione la operación:");
                        System.out.println("1. Área");
                        System.out.println("2. Perímetro");
                        int operacion = scanner.nextInt();

                        double resultado = 0;

                        switch (figura) {
                            case 1: // Círculo
                                System.out.print("Ingrese el radio: ");
                                double radio = scanner.nextDouble();
                                if (operacion == 1) {
                                    resultado = Math.PI * radio * radio;
                                    resultados.add("El área del círculo con radio " + radio + " es: " + resultado);
                                } else {
                                    resultado = 2 * Math.PI * radio;
                                    resultados.add("El perímetro del círculo con radio " + radio + " es: " + resultado);
                                }
                                break;
                            case 2: // Cuadrado
                                System.out.print("Ingrese el lado: ");
                                double lado = scanner.nextDouble();
                                if (operacion == 1) {
                                    resultado = lado * lado;
                                    resultados.add("El área del cuadrado con lado " + lado + " es: " + resultado);
                                } else {
                                    resultado = 4 * lado;
                                    resultados.add("El perímetro del cuadrado con lado " + lado + " es: " + resultado);
                                }
                                break;
                            case 3: // Triángulo
                                System.out.print("Ingrese la base: ");
                                double base = scanner.nextDouble();
                                System.out.print("Ingrese la altura: ");
                                double altura = scanner.nextDouble();
                                if (operacion == 1) {
                                    resultado = 0.5 * base * altura;
                                    resultados.add("El área del triángulo con base " + base + " y altura " + altura + " es: " + resultado);
                                } else {
                                    System.out.print("Ingrese el lado 1: ");
                                    double lado1 = scanner.nextDouble();
                                    System.out.print("Ingrese el lado 2: ");
                                    double lado2 = scanner.nextDouble();
                                    System.out.print("Ingrese el lado 3: ");
                                    double lado3 = scanner.nextDouble();
                                    resultado = lado1 + lado2 + lado3;
                                    resultados.add("El perímetro del triángulo con lados " + lado1 + ", " + lado2 + " y " + lado3 + " es: " + resultado);
                                }
                                break;
                            case 4: // Rectángulo
                                System.out.print("Ingrese la base: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese la altura: ");
                                altura = scanner.nextDouble();
                                if (operacion == 1) {
                                    resultado = base * altura;
                                    resultados.add("El área del rectángulo con base " + base + " y altura " + altura + " es: " + resultado);
                                } else {
                                    resultado = 2 * (base + altura);
                                    resultados.add("El perímetro del rectángulo con base " + base + " y altura " + altura + " es: " + resultado);
                                }
                                break;
                            case 5: // Pentágono
                                System.out.print("Ingrese el lado: ");
                                lado = scanner.nextDouble();
                                if (operacion == 1) {
                                    resultado = (1.0 / 4.0) * Math.sqrt(25 + 10 * Math.sqrt(5)) * lado * lado;
                                    resultados.add("El área del pentágono con lado " + lado + " es: " + resultado);
                                } else {
                                    resultado = 5 * lado;
                                    resultados.add("El perímetro del pentágono con lado " + lado + " es: " + resultado);
                                }
                                break;
                            default:
                                System.out.println("Opción inválida");
                                break;
                        }

                        System.out.println("¿Desea continuar? (s/n)");
                        String respuesta = scanner.next();
                        continuar = respuesta.equalsIgnoreCase("s");

                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                        scanner.nextLine(); // Limpia el buffer de entrada
                    }
                }

                System.out.println("Resultados:");
                for (String resultado : resultados) {
                    System.out.println(resultado);
                }

                scanner.close();
            }
        }