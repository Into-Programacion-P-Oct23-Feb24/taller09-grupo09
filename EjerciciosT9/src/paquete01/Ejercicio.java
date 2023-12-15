package paquete01;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n;
        String marca;
        String ac = "";

        System.out.println("Ingrese la cantidad de marcas");
        n = entrada.nextInt();
        entrada.nextLine();
        String[] vehiculos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            String inicial = marca.substring(0, 1).toUpperCase();
            if (inicial.equals("C") || inicial.equals("A")
                    || inicial.equals("T")) {
                System.out.println("Ingrese una marca que no empiecen con las "
                        + "letras A, C, T.");
                i = i - 1;
            } else {
                vehiculos[i] = marca;
                ac = String.format("%s\n%s",
                        ac, vehiculos[i]);
            }

        }
        System.out.printf("%s\n", ac);
    }
}
