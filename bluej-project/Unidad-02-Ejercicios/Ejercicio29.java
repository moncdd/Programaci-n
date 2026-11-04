/**
 * Programa que lee una secuencia de notas (0 – 10) terminada al introducir –1 
 * y cuenta el nº de suspensos, aprobados, notables y sobresalientes. 
 * Validar que las notas introducidas sean correctas.
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        //Declaramos las variables
        int nota = 0;
        int contSuspenso = 0, contAprobado = 0, contNotable = 0,contSobresaliente = 0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce una nota ");
            nota = entrada.nextInt();
            if(nota>=0 && nota<=10){
                switch(nota){
                    case 0,1,2,3,4 : System.out.println("La nota "+nota+" es un suspenso");
                                     contSuspenso++;
                                     break;
                    case 5,6 :       System.out.println("La nota "+nota+" es un aprobado");
                                     contAprobado++;
                                     break;      
                    case 7,8 :       System.out.println("La nota "+nota+" es un notable");
                                     contNotable++;
                                     break;     
                    case 9,10 :      System.out.println("La nota "+nota+" es un sobresaliente");
                                     contSobresaliente++;
                                     break;                                                   
                }                
            }
            else System.out.println("La nota introducida no es válida.\nInserta una nota válida [0-10]");
        }while(nota!=-1);    

        System.out.println("El número de notas suspensas es "+contSuspenso);
        System.out.println("El número de notas aprobadas es "+contAprobado);
        System.out.println("El número de notas notables es "+contNotable);
        System.out.println("El número de notas sobresalientes es "+contSobresaliente);
    }
}