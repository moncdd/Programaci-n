/**
 * Realizar un juego para adivinar un número. 
 * Para ello genera un número aleatorio N, y 
 * luego ir pidiendo números indicando “mayor” 
 * o “menor” según sea mayor o menor con respecto a N. 
 * El proceso termina cuando el usuario acierta. 
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,numAleatorio=(int)(Math.random()*11); // num aleatorio [1..10]
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número entre 0 y 10: ");
            num = entrada.nextInt();
            if(num>numAleatorio) System.out.println("No has acertado, introduce un número menor");
            else if(num<numAleatorio) System.out.println("No has acertado, introduce un número mayor");
            else System.out.println("Has acertado, el número era "+numAleatorio);
        }while(num!=numAleatorio);
    }
}