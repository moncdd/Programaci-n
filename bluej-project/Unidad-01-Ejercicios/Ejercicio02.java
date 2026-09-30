/*
 * Modifica los programas para que compilen y funcionen
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		/*
		//apartado a
		int n1=50;
		int n2=30,suma=0,n3;
		suma=n1+"n2";
		System.out.println("LA SUMA ES: "+"suma");
		suma=suma+n3;
		System.out.println(sum);		
		*/
		int n1=50;
		int n2=30,suma=0,n3=6; //mal declarado
		suma=n1+n2; //sobran las comillas
		System.out.println("LA SUMA ES: "+suma); //suma vale 80
		suma=suma+n3; //falta inicializar con valor
		System.out.println(suma); //suma mal escrito
		
		/*
		//apartado b
		int n1=50, n2=30,
		boolean suma=0;
		suma=n1+n2;
		System.out.println("LA SUMA ES: "+"suma");
		*/
		int nn1=50, nn2=30; //falta punto y coma
		int ssuma=0; //suma debe ser entero
		ssuma=nn1+nn2;
		System.out.println("LA SUMA ES: "+ssuma);
	}
}
