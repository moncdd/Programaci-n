/**
 * Programa que escribe los pares menores o iguales que 
 * un número introducido, este debe ser positivo y mayor que 2 
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        
       
        do{
            System.out.println("Introduce un número positivo mayor que 2:");
            num = entrada.nextInt();
            if(num>2){
                for(int i=2;i<=num;i+=2) System.out.println(i);
            }
        }while(num<3);     
    }
}
