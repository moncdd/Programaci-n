/**
 * Diseñar un programa que calcule el precio de un billete de ida y vuelta por avión, 
 * conociendo la distancia a recorrer, el número de días de estancia y sabiendo que si 
 * la distancia es superior a 1.000 Km. y el número de días de estancia es superior a 7, 
 * la línea aérea le hace un descuento del 30 %. (Precio por kilómetro = 0,05€.). 
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        //Declaramos variables
        int kms,dias;
        double precio;
        //Declaramos objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Indique la distancia a recorrer: ");
        kms = teclado.nextInt();
        System.out.print("Indique el numero de dias de estancia: ");
        dias = teclado.nextInt();
        
        // Calculo el precio de ida y vuelta
        precio = 2 * 0.05 * kms;
        // Aplico descuento si procede
        if(kms>1000 && dias>7)
            precio = 0.7*precio; //70% descuento
        
        System.out.println("El precio del billete de ida-vuelta es: "+precio);
        
        
    }
}
