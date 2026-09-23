Algoritmo Ejercicio17
	Definir nota,pract,exam Como Real;
	Definir i Como Entero;
	nota<-0;
	i<-1;
	Mientras (i<4) Hacer
		Escribir "Introduce la nota de la práctica del ",i,"º trimestre";
		Leer pract;
		Escribir "Introduce la nota del examen del ",i,"º trimestre";
		Leer exam;
		nota<-(pract*0.2)+(exam*0.8)+nota;
		i<-i+1;
	FinMientras
	nota<-nota/3;
	Escribir "La nota de Programación es ",nota;
FinAlgoritmo
