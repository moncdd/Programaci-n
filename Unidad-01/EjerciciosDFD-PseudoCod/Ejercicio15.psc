Algoritmo Ejercicio15
	Definir num Como Entero;
	Repetir
		Escribir "Introduce un número (0 para terminar el programa)";
		Leer num;
		Si (num>0) Entonces
			Si (num%2=0) Entonces
				Escribir "El número ",num," es par";
			SiNo
				Escribir "El número ",num," es impar";
			FinSi
		SiNo 
			Escribir "Dato no válido";
		FinSi
		Mientras Que(num<>0);
FinAlgoritmo