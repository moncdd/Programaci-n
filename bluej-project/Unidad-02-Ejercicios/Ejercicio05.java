
/**
 * 5. Programa que calcula el salario semanal 
 * de un empleado al que se le paga 15 euros 
 * por hora si éstas no superan las 35 horas. 
 * Cada hora por encima de 35 se considerará 
 * extra y se paga a 22 €. El programa pide las 
 * horas del trabajador y devuelve el salario que
 * se le debe pagar .
 */

public class Ejercicio05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos las constantes
        final int HORAS_SEMANALES = 35;
        // Declaramos variables
        int horas = 0, salario = 0;
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce las horas del empleado");
        horas = teclado.nextInt();

        if(horas>0) {
            salario = (horas <= HORAS_SEMANALES) ? horas * 15 : (((horas - HORAS_SEMANALES) * 22) + (HORAS_SEMANALES * 15));
            System.out.println("El salario del empleado es " + salario);
        } else {
            System.out.println("No has trabajado");
        }
        
    }

}
