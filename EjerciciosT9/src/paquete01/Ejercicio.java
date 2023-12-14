package paquete01;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] marcas;
        int nMarcas;
        int i;
        String nombre;
        String ac = "";
        System.out.println("Digite el numero de marcas que desee ingresar");
        nMarcas = entrada.nextInt();
        entrada.nextLine();
        marcas = new String[nMarcas];
        for (i = 0; i < nMarcas; i++) {
            System.out.println("Ingrese el nombre de la marca");
            nombre = entrada.nextLine();
            String inicial = nombre.substring(0);
            if (inicial.equals("A") || inicial.equals("C")
                    || inicial.equals("T")) {
                System.out.println("El nombre no debe comenzar con las letras "
                        + "A, C o T");
                i --;
            } else {
                marcas[i] = nombre;
            }
        }
        for (i = 0; i < nMarcas; i++) {
            ac = String.format("%s%s\n", ac, marcas[i]);
        }
        System.out.printf("%s", ac);
    }
}
