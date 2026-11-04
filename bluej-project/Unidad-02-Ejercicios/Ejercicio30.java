/**
 * Programa que lee 100 números y cuenta 
 * cuantos han sido pares, cuantos impares 
 * y cuantos nulos 
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num, cont = 0, par  = 0, impar = 0, nulo = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce el número "+(cont+1)+" ");
            num = entrada.nextInt();
            if(num==0) nulo++;
            else if(num%2==0) par++;
            else if(num%2!=0) impar++; 
            cont++;
        }while(cont<100);
        System.out.println("Has introducido "+nulo+" nulos");     
        System.out.println("Has introducido "+par+" pares");     
        System.out.println("Has introducido "+impar+" impares");         
    }
}