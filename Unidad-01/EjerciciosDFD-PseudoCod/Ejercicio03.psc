Algoritmo Ejercicio03
	Definir num1,num2 Como Entero;
	Repetir
		Escribir "Introduce el primer número";
		Leer num1;
		Escribir "Introduce el segundo número";
		Leer num2;
		Si(num1==num2) Entonces
			Escribir num1," y ",num2," son iguales";	
		SiNo
			Escribir num1," y ",num2," no son iguales, repetimos";
		FinSi
	Mientras Que (num1<>num2)
FinAlgoritmo