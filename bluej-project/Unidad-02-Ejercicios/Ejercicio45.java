/**
 *     Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€. 
 */

public class Ejercicio45 {
    public static void main(String[] args) {
        //Declaramos las variables
        double salario, sumSalario=0;
        int cont=0, empSueldo1000 = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce el salario del "+(cont+1)+" empleado: ");
            salario = entrada.nextDouble();
            if(salario>0){
                sumSalario+=salario;
                if(salario>1000.0) empSueldo1000++;
                cont++;
            }
        }while(cont<10);
        

        System.out.println("La suma de los salarios es "+sumSalario);
        System.out.println("El número de empleados con sueldo mayor a 1000 € es "+empSueldo1000);
    }
}