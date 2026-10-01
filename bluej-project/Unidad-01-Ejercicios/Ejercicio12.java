/*
 * Recoger un importe y un descuento y calcular el nuevo importe.   
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        //Decl. variables
        double importe,descuento,impFinal;
       
        //Usamos el teclado como entrada de programa
        java.util.Scanner teclado = new java.util.Scanner(System.in); 
        //Recogemos datos
        System.out.print("Introduzca el importe (con decimales): "); 
        importe = teclado.nextDouble(); 
        System.out.print("Introduzca el descuento (con decimales): "); 
        descuento = teclado.nextDouble(); 

        //Op. y mostramos
        impFinal = importe * (100 - descuento)/100;
        
        System.out.println("El importe con el descuento aplicado es "+impFinal);
    }
}
