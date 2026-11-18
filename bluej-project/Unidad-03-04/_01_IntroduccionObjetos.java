/**
 * Esta clase sirve para introducir los conceptos
 * básicos del paradigma de programación Orientación a Objetos
 */
public class _01_IntroduccionObjetos
{
    public static void main(String[] args)
    {
        // 1º. Para crear objetos, tenemos que hacerlo
        // mediante su clase. Sintaxis:
        // <Clase> <nombre_objeto> = new <Método_constructor>;
        java.awt.Point miPuntito = new java.awt.Point();
        
        // 2º. Damos valor a sus atributos directamente
        // <nombre_objeto>.<atributo>
        miPuntito.x = 5; // asignamos el valor 5 al atributo x
        miPuntito.y = 8; // asignamos el valor 8 al atributo y
        
        // 3º. Consultamos si los atributos son correctos
        System.out.println("La coordenada x de miPuntito es "+miPuntito.x);
        System.out.println("La coordenada y de miPuntito es "+miPuntito.y);
        
        // 4º. Utilizamos los métodos del objeto
        // <nombre_objeto>.<método>
        miPuntito.move(13,2); // movemos el objeto a la nueva posición
        System.out.println("La coordenada x de miPuntito es "+miPuntito.getX());
        System.out.println("La coordenada y de miPuntito es "+miPuntito.getY());
    }
}
