Algoritmo Ejercicio08
	Definir n,i,dato,suma,producto Como Entero;
	suma<-0;
	producto<-1;
	i<-1;
	Escribir "Escribe el número de datos a insertar";
	Leer n;
	Mientras (i<n+1) Hacer
		Escribir "Introduce el dato ",i;
		Leer dato;
		Si (dato%2==0) Entonces
			suma<-suma+dato;
		SiNo
			producto<-producto*dato;
		FinSi
		i<-i+1;
	FinMientras
	Escribir "La suma de los números pares es ",suma;
	Escribir "El producto de los números impares es ",producto;
FinAlgoritmo