/**
 * Pedir el salario de 10 empleados. 
 * Mostrar cuantos ganan más de 1000€. 
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        //Declaramos las variables
        double salario;
        int cont=0, empSueldo1000 = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce el salario del "+(cont+1)+" empleado: ");
            salario = entrada.nextDouble();
            if(salario>1000.0) empSueldo1000++;
            cont++;
        }while(cont<10);
        
        /*
        for(int i=0;i<10;i++)
        {
            System.out.print("Introduce el salario del "+(i+1)+" empleado: ");
            salario = entrada.nextDouble();
            if(salario>1000.0) empSueldo1000++;
        }
         */

        System.out.println("El número de empleados con sueldo mayor a 1000 € es "+empSueldo1000);
    }
}