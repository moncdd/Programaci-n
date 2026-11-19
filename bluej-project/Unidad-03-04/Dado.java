import java.util.*;

public class Dado
{
    public static void main(String[] args)
    {
        // Definimos los objetos del programa
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        
        // Variables utilizadas
        int numUsuario, numDado;
        
        // Generamos el número del dado
        numDado = r.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
        
        // Pedimos datos hasta que acierte el usuario
        do{
            // Pedimos datos al usuario
            System.out.print("Introduce un número válido del dado: ");
            numUsuario = teclado.nextInt();
            
            if(numUsuario>=1 && numUsuario<=6)
            {
                // Comprobamos si el usuario ha acertado
                if(numUsuario == numDado) System.out.println("Has acertado");
                else System.out.println("Has perdido. Puedes repetir el intento");
            }
            else System.out.println("No has introducido un dato válido");
        }while(numUsuario!=numDado);
    }
}
