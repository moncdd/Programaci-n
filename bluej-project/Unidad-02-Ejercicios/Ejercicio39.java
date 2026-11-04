/**
 * Programa que nos informa si un número introducido es primo o no.
 */
public class Ejercicio39 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        boolean esPrimo = true; //consideramos que todo número introducido es primo
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                esPrimo = false; //encontramos un caso en el que el número no es primo
                break;          //forzamos salir del bucle 
            }
        } 
        
        if(esPrimo) System.out.println("El número "+num+" es primo");
        else System.out.println("El número "+num+" no es primo");

    }
}