
public class _23_Factorial
{
    static int factorial(int numero)
    {
        int res = 1;
        for(int i = numero; i>0 ; i--)
        {
            res = res * i;
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }
}
