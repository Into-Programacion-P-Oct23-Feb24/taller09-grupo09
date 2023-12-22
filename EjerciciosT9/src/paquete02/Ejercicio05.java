/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        char inicialLetra;
        boolean bandera = true;
        while (bandera) {
            while (bandera) {
                System.out.println("Ingrese una letra");
                inicial = entrada.nextLine().toUpperCase();
                /* hicimos un ciclo repetitivo, que mientras no se ingrese 
                ninguna de las letras presentadas en el switch case
                siga preguntando por una letra, ya que si una letra coincide 
                con el case, bandera pasa a ser false y rompe el ciclo*/
                switch (inicial) {
                    case ("K"):
                    case ("H"):
                    case ("T"):
                    case ("L"):
                    case ("M"):
                    case ("J"):
                    case ("A"):
                        bandera = false;
                        break;
                    default:
                }
            }
        }
    }
}

            
        
    

