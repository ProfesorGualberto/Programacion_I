Algoritmo calculo_de_areas
	Escribir 'Calculo de àreas'
	Escribir '1: circulo '
	Escribir '2: rectangulo '
	Escribir '3: cuadrado '
	Escribir '4:triangulo  '
	Escribir '5: otras  figuras'
	
	Leer Opcion
	Si Opcion=1 Entonces
		// Eligio circulo
		Escribir 'Ingrese  el radio:'
		Leer radio
		area <- radio*radio*PI
	FinSi
	Si Opcion = 2 Entonces
		// Calcular area de rectangulo
		Escribir "Digite la base"
		Leer base
		Escribir "Digite altura"
		Leer altura
		area  = base * altura
	FinSi
	Escribir "El area es:", area
FinAlgoritmo
