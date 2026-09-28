Algoritmo Ejercicio13
	Definir num,cuad Como Entero;
	Repetir
		Escribir "Introduce un número entero positivo";
		Leer num;
		Si(num>0) Entonces
			cuad<-num*num;
			Escribir "El cuadrado de ",num," es ",cuad;
		SiNo
			Escribir "Dato no válido";
		FinSi
	Mientras Que(num>0); 
FinAlgoritmo