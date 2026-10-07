/* 
 * Programa que lee dos números enteros y 
 * nos dice si son iguales o distintos 
 */
public class Ejercicio17
{
    public static void main(String[] args)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        int num1,num2;
        String msg;
        
        System.out.print("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = teclado.nextInt();
        msg = (num1==num2)?"Iguales":"Distintos";
        System.out.println(msg);
    }
}
