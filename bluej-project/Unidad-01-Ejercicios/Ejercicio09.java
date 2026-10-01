/*
 * Calcular el área de un círculo
 */
public class Ejercicio09 {
    public static void main(String[] args){
        //Decl. constantes
        final double PI = Math.PI;
        //Decl. variables
        double radio = 5.2, area;
        //Operamos
        area = PI * Math.pow(radio,2); // area = PI*radio*radio;
        //Mostramos
        System.out.println("Resultado: " + area);
    }
}
