/**
 * En un determinado comercio se realiza un descuento dependiendo del precio de cada producto. 
 * Si el precio es inferior a 6 euros, no se hace descuento; 
 * si es mayor o igual que 6 euros y menor que 60 euros, se hace un 5% de descuento, 
 * y si es mayor o igual que 60 euros, se hace un 10 % de descuento. 
 * Programa que lee el precio de un producto y nos calcula y escribe su precio final. 
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        //declaramos variables
        double precio;
        //Leemos teclado
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Escriba el precio del producto: ");
        precio = entrada.nextDouble();
        
        
        // En funcion del precio devuelvo error o aplico el descuento apropiado
        if(precio<0) System.out.println("ERROR - precio negativo");
        if(precio>=6 && precio<60) precio = precio*0.95;
        else if(precio>=60) precio = precio*0.9;
        
        System.out.println("El precio final es: "+precio);
        
        
    }
}
