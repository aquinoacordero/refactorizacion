package refactorizar;
import java.util.Scanner;

public class Refactorizar {

    public static void main(String[] args) {
        boolean primo = false;
        int max_min = 0;
        int contadorDigitos = 0;
        max_min = entradaDato();
        if (max_min <= 6) {
            System.out.print("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigitos = contador;

            if (contadorDigitos == max_min) {
                if (i < 4) {
                    primo = true;
                } else {
                    if (i % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    private static int entradaDato() {
        int max_min;
        Scanner valor = new Scanner(System.in);
        System.out.print("introducir valor: ");
        max_min = valor.nextInt();
        return max_min;
    }

}
