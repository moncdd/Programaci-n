/**
 * Dadas las edades y alturas de 5 alumnos, 
 * mostrar la edad y la estatura media, 
 * la cantidad de alumnos mayores de 18 años, 
 * y la cantidad de alumnos que miden más de 1.75 = 175 / 100
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        //Declaramos las variables
        double altura, sumAltura = 0.0;
        int cont = 0, edad, sumEdad = 0, aluMayorEdad = 0, aluMayorAltura = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce la edad del alumno "+(cont+1)+" ");
            edad = entrada.nextInt();
            System.out.print("Introduce la altura del alumno "+(cont+1)+" ");
            altura = entrada.nextDouble();
            //acumulamos las sumas
            sumEdad += edad; sumAltura += altura;
            if(edad>18) aluMayorEdad++;
            if(altura>1.75) aluMayorAltura++;
            cont++;
        }while(cont<5); 

        System.out.println("La edad media de los alumnos es "+((double)sumEdad/5.0));
        System.out.println("La altura media de los alumnos es "+(sumAltura/5.0));
        System.out.println("El número de los alumnos con edad mayor de 18 es "+aluMayorEdad);
        System.out.println("El número de los alumnos con altura mayor de 1.75 es "+aluMayorAltura);    
    }
}