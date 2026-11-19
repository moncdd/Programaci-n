
public class _06_StaticObject
{
    // atributos
    String nombre;
    String apellido;
    
    // no constructor
    
    // no métodos
    
    public static void main(String[] args)
    {
        _06_StaticObject alumna1 = new _06_StaticObject();
        
        alumna1.nombre = "María";
        alumna1.apellido = "López";
        
        _06_StaticObject alumna2 = new _06_StaticObject();
        
        
        
        
        System.out.println(alumna1.nombre+" "+alumna1.apellido);
        System.out.println(alumna2.nombre+" "+alumna2.apellido);
    }
}
