Algoritmo Ejercicio06
	Definir i Como Entero;
	Definir nota,suma,alumnos,media Como Real;
	suma<-0;
	alumnos<-10;
	i<-1;
	Mientras (i<11) Hacer
		Escribir "Introduce la ",i,"º nota";
		Leer nota;
		suma<-suma+nota;
		i<-i+1;
	FinMientras
	media<-suma/alumnos;
	Escribir "La media de las notas de los ",alumnos," alumnos es: ",media;
FinAlgoritmo