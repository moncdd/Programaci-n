Algoritmo Ejercicio16
	Definir num,cont Como Entero;
	cont<-0;
	Repetir
		Escribir "Introduce un número";
		Leer num;
		Si(num>-1) Entonces
			cont<-cont+1;
		FinSi
	Mientras Que(num>-1);
	Escribir "Has introducido ",cont," números válidos";
FinAlgoritmo
