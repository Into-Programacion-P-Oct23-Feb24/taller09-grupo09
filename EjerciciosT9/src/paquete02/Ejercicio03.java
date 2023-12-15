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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mArriba = 0;
        int mDebajo = 0;
        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        double promedio = suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                mArriba++;
            } else {
                if (arreglo[i] < arreglo.length) {
                    mDebajo++;
                }
            }
        }
        System.out.printf("Promedio: %.2f\nElementos por encima: %d\nElementos "
                + "por debajo: %d\n", promedio, mArriba, mDebajo);
    }
}