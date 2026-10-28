/**
 * 7. Escribe un programa que lea una temperatura 
 * introducida a través de teclado y muestre 
 * por pantalla la actividad más apropiada para dicha
 * temperatura teniendo en cuenta los siguientes criterios.
 * ACTIVIDAD TEMPERATURA IDONEA
 * Natación temp > 30
 * Tenis 20 < temp <= 30
 * Golf 10 < temp <= 20
 * Esquí 5 < temp <= 10
 * Parchís temp <= 5
 */

public class Ejercicio07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int temp = 0;
        String msg = "";
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce una temperatura numérica entera");
        temp = teclado.nextInt();

        if(temp>30) msg = "Natación";
        else if(temp>20 && temp<=30) msg = "Tenis";
        else if(temp>10 && temp<=20) msg = "Golf";
        else if(temp>5  && temp<=10) msg = "Esquí";
        else if(temp<=5) msg = "Parchís";

        System.out.println("ACTIVIDAD TEMPERATURA IDONEA PARA "+temp+" GRADOS: "+msg);

    }

}
