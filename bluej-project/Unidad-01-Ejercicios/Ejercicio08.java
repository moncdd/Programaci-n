/*
 * Calcular la longitud de circunferencia de 3 metros
 */
public class Ejercicio08 {
    public static void main(String[] args){
        //Decl. constantes
        final double PI = Math.PI; //PI = 3.14159;
        //Decl. variables
        int radio = 3;
        double longitud;
        //Operamos
        longitud = 2*PI*radio;
        //Mostramos
        System.out.println("Resultado: "+longitud);
    }    
}
