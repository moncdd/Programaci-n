
/**
 * 4. Programa que lee dos números enteros 
 * y nos dice si son iguales o distintos 
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int num1 = 0, num2 = 0;
        String msg = "";
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce el primer número a comparar");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número a comparar");
        num2 = teclado.nextInt();

        msg = (num1 == num2) ? "iguales" : "diferentes";
        System.out.println("Los números " + num1 + " y " + num2 + " son " + msg);

    }

}
