/**
 * Programa que lee un número y escribe todos los pares anteriores a él 
 */

public class Ejercicio33 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce un número positivo mayor que cero ");
        num = entrada.nextInt();

        //si es número válido...    
        if(num>0){
            for(int i=num-1;i>0;i--){
                if(i%2==0) System.out.println(i);        
            }            
        }
        //no es número válido
        else System.out.println("Número no válido");
    }
}