
public class _07_ContadorObjetos
{
    // atributo encargado de contar los objetos creados
    static int contadorObjetos = 0;
    
    // Método constructor
    public _07_ContadorObjetos()
    {
        contadorObjetos++;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Objetdos creados = "+contadorObjetos);
        
        // 1º obj
        _07_ContadorObjetos obj1 = new _07_ContadorObjetos();
        System.out.println("Obj1. Objetdos creados = "+contadorObjetos);
        
        // 2º obj
        _07_ContadorObjetos obj2 = new _07_ContadorObjetos();
        System.out.println("Obj2. Objetdos creados = "+contadorObjetos);
        
        // 3º obj
        _07_ContadorObjetos obj3 = new _07_ContadorObjetos();
        System.out.println("Obj3. Objetdos creados = "+contadorObjetos);
    }
}
