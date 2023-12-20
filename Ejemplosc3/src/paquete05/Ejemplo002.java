/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int[][] arreglo = {{10,41,40}, {1,2,3}, {1,12,4}};
        int suma=0;
        for(int fila = 0;fila<arreglo.length;fila++){
            for(int col = 0; col<arreglo[fila].length;col++){
                if (fila==col){
                  suma = suma + arreglo[fila][col];  
                }
            }
        }
        System.out.printf("%d \n",suma);
        
        /*
            Este programa suma los valores de las posiciones 10, 2, 4 de la
            siguiente forma, primero se crea un arreglo tipo entero el cual
            guarda los numeros dados, luego se crea una variable tipo suma
            encargada de sumar las posiciones ya establecidas, dentro de dos ciclos
            repetitivos, se encontrara una condicional encargada de verificar
            si la fila es igual a la columna para luego proceder a sumarlo,
            caso contrario no hara nada, y luego al terminar los dos ciclos 
            repetitivos se presentara por pantalla la suma.
        */
    }
}
