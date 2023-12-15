/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa "
            + "Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];

        for (int i = 0; i < promedios.length; i++) {
            double n = promedios[i];
            if (n >= 0 && n <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else {
                if (n >= 6 && n <= 8.9) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    if (n >= 9 && n <= 10) {
                        promediosCualitativos[i] = "Sobresaliente";
                    }
                }
            }
        }
        for (int l = 0; l < promedios.length; l++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                    estudiantes[l], promedios[l], promediosCualitativos[l]);
        }
    }

}

