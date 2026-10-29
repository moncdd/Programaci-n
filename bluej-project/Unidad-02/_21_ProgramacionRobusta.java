/**
 * Ejemplo de programación robusta.
 * Imponemos una precondición en los datos de entrada
 * para garantizar el correcto funcionamiento de la función.
 * Si cumplimos la precondición, el subprograma se compromete
 * a tener una salida correcta (postcondición)
 */
public class _21_ProgramacionRobusta
{
    /**
     * Precondición: dado el ejercicio o enunciado, se entiende
     * que los datos de entrada tienen que estar en el intervalo 
     * [0..10]
     */
    static String boletinNotas(double notaNumerica)
    {
        
        String res = "";
        // precondición, datos permitidos
        if(notaNumerica>=0 && notaNumerica<=10)
        {
            if(notaNumerica>=0 && notaNumerica<5 )
            {
                res = "Suspenso";
            }
            else if(notaNumerica>=5 && notaNumerica<7 ) res = "Aprobado";
            else if(notaNumerica>=7 && notaNumerica<9 ) res = "Notable";
            else res = "Sobresaliente";
        }
        else res = "Datos no válidos";
        
        return res;
    }
    
    /**
     * Precondición: el divisor NO puede ser cero
     * Si dividendo y divisor son enteros Y 
     * divisor distinto de cero, se cumple postcondición
     */
    static int divisionEntera(int dividendo, int divisor)
    {
        int cociente = -1;
        if(divisor != 0 && (dividendo>0 && divisor>0))
        {
            cociente = dividendo / divisor;
        }
        
        return cociente;
    }
    
    
    public static void main(String[] args)
    {
        String msg = boletinNotas(1.0);
        System.out.println(msg); // System.out.println(boletinNotas(1.0));
    }
}
