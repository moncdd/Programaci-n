/**
 * Una empresa tiene trabajadores de categorías A, B y C. 
 * El sueldo por mes trabajado es de 1100€. 
 * Además, cobran todos por trimestre un suplemento de 240€, excepto los de categoría C. 
 * De éstos, en la sección 1ª están los contratados por días, que cobran un suplemento de 0.5 € 
 * por día trabajado y se les descuenta 30 € por baja injustificada. 
 * El resto de las secciones de esta categoría cobra 1.20€ de suplemento por día trabajado y 
 * se les descuenta 10€ por baja injustificada. 
 * Programa que lee los datos de un trabajador (tendrás que leer los datos que necesites 
 * en función de la categoría y la sección) y nos calcula su sueldo final. 
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        //Declaramos las constantes
        final double SUELDO_FIJO=1100;
        //Declaramos las variables
        double sueldoTotal = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("Introduce la categoría del trabajador:");
        char categoria = (entrada.nextLine()).charAt(0); // Lee un caracter

        System.out.println("Introduce el número de meses:");
        int meses = entrada.nextInt();
        sueldoTotal=SUELDO_FIJO*meses;
        
        switch(categoria) {
        case 'A':
        case 'B':
            sueldoTotal += (meses/3)*240 ;
            System.out.println("El sueldo es de: " + sueldoTotal + " euros");
            break;
        case 'C':
            System.out.println("Introduce la seccion del trabajador:");
            int seccion=entrada.nextInt();
            System.out.println("Introduce el numero de dias trabajados:");
            int diaTrabajado=entrada.nextInt();
            System.out.println("Introduce numero de bajas injustificadas:");
            int bajaInjustificada=entrada.nextInt();

            switch(seccion) {
            case 1:
                sueldoTotal += (diaTrabajado*0.5)-(bajaInjustificada*30);
                System.out.println("El sueldo final es de: " + sueldoTotal + "€");
                break;
            case 2:
                sueldoTotal+=(diaTrabajado*1.20)-(bajaInjustificada*10);
                System.out.println("El sueldo final es de: " + sueldoTotal + "€");
                break;
            default:
                System.out.println("ERROR: la sección no existe");
            }
            break;
        default:
            System.out.println("ERROR: la categoria no existe");
        }

        
    }
}
