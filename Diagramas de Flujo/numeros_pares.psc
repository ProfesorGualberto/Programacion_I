Algoritmo numeros_pares
	Escribir "Ingrese numero inicial"
	Leer inicio
	Escribir "Ingrese  el n�mero final"
	Leer final
	salto = inicio
	Mientras salto <= final Hacer
		Si (salto MOD 2)=0 Entonces
			Escribir "Par:",salto
		FinSi
		salto = salto +1
	FinMientras
FinAlgoritmo
