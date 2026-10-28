/**
 * Programa que lee una nota numérica y escribe la correspondiente calificación: 
 * NOTA                        CALIFICACIÓN
 * INFERIOR A 5                SUSPENSO
 * 5                           SUFICIENTE 
 * MAYOR QUE 5 Y MENOR QUE 7   BIEN
 * ENTRE 7 Y 8.9               NOTABLE
 * IGUAL O MAYOR QUE 9         SOBRESALIENTE
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        //Declaramos las variables
        double nota = 0.0;
        String msg = "";
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("Introduce la nota [0..10]:");
        nota = entrada.nextDouble();
        

        if(nota>=0 && nota<=10){
            if(nota<5.0) msg = "suspenso";
            else if(nota==5.0) msg = "suficiente";
            else if(nota>5.0 && nota<7.0) msg = "bien";
            else if(nota>=7.0 && nota<=8.9) msg = "notable";
            else if(nota>8.9) msg = "sobresaliente";
            System.out.println("La nota "+nota+" tiene una calificación de "+msg);
        }
        else System.out.println("La nota "+nota+" no es válida");
                
    }
}
