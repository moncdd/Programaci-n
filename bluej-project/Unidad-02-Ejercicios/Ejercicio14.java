/**
 * Con objeto de fomentar el ahorro energético, el recibo de la electricidad se elabora 
 * de forma que el precio de cada Kw/h consumido es más caro cuanto más se consume: 
 * • 2€ de gastos fijos 
 * • 0,50€/Kwh para los primeros 100 Kwh 
 * • 0,70€/Khw para los siguientes 150 Kwh 
 * • 1€/Kwh para el resto 
 * Elabora un programa que lee de teclado los dos últimos valores del contador 
 * (lo que marca actualmente y lo que marcaba en la última lectura), y calcula e 
 * imprime en pantalla el importe total a pagar. 
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        //declaramos las constantes
        final double GASTOS_FIJOS = 2.0;
        final double TRAMO1 = 0.5;
        final double TRAMO2 = 0.75;
        final double TRAMO3 = 1.0;
        //declaramos variables
        double contador = 0.0, consumo = 0.0;
        //Leemos teclado
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Escriba los valores de la última lectura: ");
        contador = entrada.nextDouble();
        System.out.print("Escriba los valores de la lectura actual: ");
        contador = entrada.nextDouble() - contador;
        
        
        System.out.print("Desde la última lectura has consumido "+contador+" Kw");
        
        if(contador<100.0) consumo = GASTOS_FIJOS + (TRAMO1) * contador;
        else if(contador>=100.0 && contador<250) consumo = GASTOS_FIJOS + (TRAMO1 * 100) + ((contador - 100) * TRAMO2);
        else consumo = GASTOS_FIJOS + (TRAMO1 * 100) + (TRAMO2 * 150) + ((contador - 250) * TRAMO3);

        System.out.println("Tu consumo es de "+consumo+" €");
    }
}
