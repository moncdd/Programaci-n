/* 
 * Programa que lee dos números enteros y 
 * nos dice si son iguales o distintos 
 */
public class Ejercicio18
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
        msg = (num1>num2)?num1+" es mayor que "+num2:num2+" es mayor o igual que "+num1;
        System.out.println(msg);
    }
}
