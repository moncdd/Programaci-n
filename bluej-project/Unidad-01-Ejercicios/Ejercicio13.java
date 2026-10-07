/*
 * Dadas tres notas, que haga la media
 */

public class Ejercicio13 {
    public static void main(String[] args){
        //Decl. variables
        int nota1,nota2,nota3,sumaNotas,numNotas = 3;
        float media;

        //Usamos el teclado como entrada de programa
        java.util.Scanner teclado = new java.util.Scanner(System.in); 
        //Recogemos datos
        System.out.print("Introduce la primera nota (número entero): "); 
        nota1 = teclado.nextInt(); 
        System.out.print("Introduce la segunda nota (número entero): "); 
        nota2 = teclado.nextInt(); 
        System.out.print("Introduce la tercera nota (número entero): "); 
        nota3 = teclado.nextInt(); 

        //Op. y mostramos
        sumaNotas = nota1 + nota2 + nota3;
    
        media = (float)sumaNotas / (float)numNotas;
        
        System.out.println("La media de las notas es "+media);
    }
}
