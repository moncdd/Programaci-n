/*
 * Intercambiar valores
 */
public class Ejercicio10 {
    public static void main(String[] args){
        //Decl. variables
        int valor1,valor2,aux;
        //Iniciamos 
        valor1 = 5; valor2 = 9;
        //Mostramos antes de intercambiar
        System.out.println("El valor 1 es: "+valor1+" y el valor 2 es: "+valor2);
        //necesitamos variable auxiliar para intercambiar
        aux = valor2;    //valor1: 5 ; valor2: 9
        valor2 = valor1; //valor1: 5 ; valor2: 5
        valor1 = aux;    //valor1: 9 ; valor2: 5
        System.out.println("Intercambiando...\nEl valor 1 es: "+valor1+" y el valor 2 es: "+valor2);
    }
}
