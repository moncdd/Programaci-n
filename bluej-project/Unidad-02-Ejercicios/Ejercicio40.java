/**
 * Programa que lee 9 números, y en el caso en el que el primero 
 * introducido sea igual al último, nos muestra la media. 
 * En caso contrario, no se mostrará nada.
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,numPrimero=0,numUltimo=0,sum=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        for(int i=0;i<9;i++){
            System.out.println("Introduce el "+(i+1)+" número");
            num = entrada.nextInt();
            sum += num;
            if(i==0) numPrimero = num;
            if(i==8) numUltimo = num; 
        } 
        
        if(numPrimero==numUltimo) System.out.println("La media de los números introducidos es "+((double)sum/9.0));
    }
}