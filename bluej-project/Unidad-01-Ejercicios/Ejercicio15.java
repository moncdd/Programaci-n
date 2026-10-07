/* 
 * Realiza un programa en java que genere letras 
 * de forma aleatoria. Para ello investiga el 
 * funcionamiento y uso de la función Math.random();
 */
public class Ejercicio15
{
    public static void main(String[] args)
    {
        // Rango A-Z -> 65-90
        int sup = 90, inf = 65, rango = (sup - inf) + 1;
        int aleatorio = (int) ((rango * Math.random()) + inf);
      
        char letra = (char) aleatorio;
        
        System.out.println(letra);        
    }
}
