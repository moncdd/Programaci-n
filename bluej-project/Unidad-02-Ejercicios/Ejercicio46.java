/**
 *     Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos. 
 */

public class Ejercicio46 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int nota, aprobados = 0, condicionados = 0, suspensos = 0;
        
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        for(int i=0;i<6;i++) {
            System.out.println("Introduce la nota "+(i+1));
            nota = teclado.nextInt();
            if(nota>=0&&nota<4) suspensos++;
            else if(nota==4) condicionados++;
            else if(nota>4&&nota<=10) aprobados++;
            else {
                System.out.println("Nota no válida");
                i--;//decremento el invariante
            }
        } 
        
        
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Condicionados: "+condicionados);
        System.out.println("Suspensos: "+suspensos);
    }

}
