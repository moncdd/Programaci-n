Algoritmo Ejercicio18
	Definir num1,num2 Como Entero;
	Escribir "Introduce el primer número";
	Leer num1;
	Escribir "Introduce el segundo número";
	Leer num2;
	Si(num1>0 Y num2>0) Entonces
		num1<-num1+num2;
		Escribir "Los números son positivos y su suma es ",num1;
	SiNo
		Si(num1<0 Y num2<0) Entonces
			num1<-num1-num2;
			Escribir "Los números son negativos y su resta es ",num1;
		SiNo
			Si(num1=0 O num2=0) Entonces
				Escribir "Mensaje de error";
			FinSi
		FinSi
	FinSi
FinAlgoritmo