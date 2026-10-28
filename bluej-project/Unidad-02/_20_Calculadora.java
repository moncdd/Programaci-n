/**
 * Ejemplo de una calculadora
 */
public class _20_Calculadora
{
    /**
     * int: indica que devuelve un dato int
     * (int num1, int num2): indica que recibe dos datos enteros
     */
    static int suma(int num1, int num2)
    {
        int suma = num1 + num2;
        return suma; // num1+num2; 
    }
    
    /**
     * int: indica que devuelve un dato int
     * (int num1, int num2): indica que recibe dos datos enteros
     */
    static int resta(int num1, int num2)
    {
        int resta = num1 - num2;
        return resta; // num1-num2; 
    }
    
    /**
     * int: indica que devuelve un dato int
     * (int num1, int num2): indica que recibe dos datos enteros
     */
    static int multiplicacion(int num1, int num2)
    {
        int multiplicacion = num1 * num2;
        return multiplicacion; // num1*num2; 
    }
    
    /**
     * int: indica que devuelve un dato int
     * (int num1, int num2): indica que recibe dos datos enteros
     */
    static int division(int num1, int num2)
    {
        int division = num1 / num2;
        return division; // num1/num2; 
    }
    
    static void menuSuma()
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        System.out.println(suma(num1,num2));
    }
    
    static void menuResta()
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        System.out.println(resta(num1,num2));
    }
    
    static void menuMultiplicacion()
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        System.out.println(multiplicacion(num1,num2));
    }
    
    static void menuDivision()
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        System.out.println(division(num1,num2));
    }
    
    static void menu()
    {
        int opcion;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        System.out.println("=== Calculadora ===");
        System.out.println("1. Suma"); 
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División (entera)");
        System.out.println("--------------------");
        System.out.print("Introduce opción: ");
        
        opcion = teclado.nextInt();
        switch(opcion)
        {
            case 1: menuSuma();
                    break; 
            case 2: menuResta();
                    break;
            case 3: menuMultiplicacion();
                    break;
            case 4: menuDivision();
                    break;
            default: System.out.println("Operación no válida");
        }
    }
    
    public static void main(String[] args)
    {
        menu();
    }
}
