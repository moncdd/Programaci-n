/**
 *     Pedir 8 números y escribir la suma total. 
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,suma=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        for(int i=0;i<8;i++) {
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            suma += num;
        } 
        
        System.out.println("La suma de los ocho números es: "+suma);

    }
}