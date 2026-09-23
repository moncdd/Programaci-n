Algoritmo Ejercicio10
	Definir nota Como Real;
	Escribir "Introduce una nota";
	Leer nota;
	Si(nota>=0 Y nota <=10) Entonces
		Si (nota>=0 Y nota<5) Entonces
			Escribir "Has suspendido";
		SiNo
			Escribir "Has aprobado";
		FinSi
	SiNo
		Escribir "Nota no válida [0-10]";
	FinSi
FinAlgoritmo