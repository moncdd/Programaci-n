/*
 * ¿Qué mostrará el siguiente código por pantalla?
 */
public class Ejercicio04 {
    
    public static void main(String[] args){
        int num=5;
        num+=1; // num = num + 1;
        num++; // num = num + 1;
        int resto = num % 2; // num % 2 ¿es par?
        System.out.println(num);
        System.out.println(resto);
        boolean par = (resto == 0);
    }
}