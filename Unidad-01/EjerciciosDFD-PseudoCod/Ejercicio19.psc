Algoritmo Ejercicio19
	Definir salario,horas Como Entero;
	salario<-0;
	Escribir "Introduce las horas trabajadas";
	Leer horas;
	Si(horas>0) Entonces
		Si(horas<=35) Entonces
			salario<-horas*15;
		SiNo
			salario<-(35*15)+((horas-35)*22);
		FinSi
	SiNo
		Escribir "Dato no válido"; 
	FinSi
	Escribir "El salario del trabajador es ",salario;
FinAlgoritmo