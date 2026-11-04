/**
 *         Pedir 10 números. 
 *         Mostrar la media de los números positivos, 
 *         la media de los números negativos y 
 *         la cantidad de ceros. 
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,contPos=0,contNeg=0,sumPos=0,sumNeg=0,contCeros=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        for(int i=0;i<10;i++) {
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            if(num>0) {
                contPos++;sumPos+=num;
            }
            else if(num<0) {
                contNeg++;sumNeg+=num;
            }
            else contCeros++;
        }
        
        System.out.println("La media de los números positivos es: "+((double)sumPos/(double)contPos));
        System.out.println("La media de los números negativos es: "+((double)sumNeg/(double)contNeg));
        System.out.println("La cantidad de ceros es: "+contCeros);

    }
}