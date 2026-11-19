import java.util.*;

public class Moneda
{
    public static void main(String[] args)
    {
        // Definimos los objetos del programa
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        
        // Variables utilizadas
        String monedaUsuario;
        double dMonedaUsuario = 0.0, monedaAzar;
        
        
        
        // Pedimos datos hasta que acierte el usuario
        do{
            // Generamos la moneda
            monedaAzar = r.nextDouble(); // Genera un número aleatorio entre 1 y 6
            // Pedimos datos al usuario
            System.out.print("Introduce una cara de moneda ['C'|'X']: ");
            monedaUsuario = teclado.nextLine();

            if(monedaUsuario == "C" || monedaUsuario == "X")
            {
                // Comprobamos si el usuario ha acertado
                if(monedaUsuario == "C") dMonedaUsuario = 0.25;
                else if(monedaUsuario == "X") dMonedaUsuario = 0.75;
                
                if(dMonedaUsuario < 0.5 && monedaAzar < 0.5) 
                {
                    System.out.println("Has acertado");
                    break;
                } 
                else if(dMonedaUsuario > 0.5 && monedaAzar >= 0.5) 
                {
                    System.out.println("Has acertado");
                    break;
                }  
                else
                    System.out.println("Has perdido. Vuelve a intentar");
            }
            else System.out.println("No has introducido un dato válido");
        }while(true);
    }
}
