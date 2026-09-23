Algoritmo Ejercicio14
	Definir num Como Entero;
	Repetir
		Escribir "Introduce un número (0 para terminar el programa)";
		Leer num;
		Si (num>0) Entonces
			Escribir "El número ",num," es positivo";
		SiNo Si (num<0) Entonces
				Escribir "El número ",num," es negativo";
			FinSi
		FinSi
	Mientras Que(num<>0);
FinAlgoritmo