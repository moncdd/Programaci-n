/**
 * Pide un número (que debe estar entre 0 y 10) y 
 * mostrar la tabla de multiplicar de dicho número. 
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce un número entre 0 y 10 ");
        num = entrada.nextInt();

        //si es número válido...    
        if(num>=0 && num<=10){
            System.out.println("TABLA DE MULTIPLICAR DEL "+num);
            System.out.println("============================");
            for(int i=0;i<11;i++){
                System.out.println(num+" x "+i+" = "+(num*i));        
            }            
        }
        //no es número válido
        else System.out.println("Número no válido");
    }
}