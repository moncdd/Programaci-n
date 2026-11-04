/**
 * Programa que lee las notas en programación de esta clase y 
 * cuenta el nº de aprobados 
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        //Declaramos las constantes
        final int ALUMNOS = 30;
        //Declaramos las variables
        int nota = 0, contAprobados = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        for(int i=1;i<=ALUMNOS;i++){
            System.out.println("Introduce la nota del alumno "+i);
            nota = entrada.nextInt();
            if(nota>=5) contAprobados++;
        }   

        System.out.println("Los alumnos aprobados son "+contAprobados);    
    }
}
