/*
 * Programa que lee el precio de un producto y el precio final y calcula el descuento realizado 
 */


public class Ejercicio14 {
    public static void main(String[] args){
        //Decl. variables
        float importe,precio,descuento;
       
        //Usamos el teclado como entrada de programa
        java.util.Scanner teclado = new java.util.Scanner(System.in); 
        //Recogemos datos
        System.out.print("Introduzca el importe del producto (con decimales): "); 
        importe = teclado.nextFloat(); 
        System.out.print("Introduzca el precio final abonado (con decimales): "); 
        precio = teclado.nextFloat(); 

                
        //Op. y mostramos
        descuento = (importe - precio) / importe * 100;
        
        System.out.println("El descuento aplicado es "+descuento);
    }
}
