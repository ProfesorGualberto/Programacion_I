Algoritmo ejercicio_12
	// Ejercicio 12: Realizar un programa que pida tres números y diga cuál es el mayor, cuál es el
	// segundo mayor, y cuál es el menor
	Escribir 'Introducir a'
	Leer a
	Escribir 'Introducir b'
	Leer b
	Escribir 'Ingrese c'
	Leer c
	Si a>b Entonces
		Mayor <- a
		Letra_Mayor <- 'a'
		Menor <- b
		Letra_Menor <- 'b'
		Si a>c Entonces
			Si c>b Entonces
				Medio <- c
				Letra_Medio <- 'c'
			SiNo
				Medio <- b
				Letra_Medio <- 'b'
				Menor <- c
				Letra_Menor <- 'c'
			FinSi
		FinSi
	SiNo
		Mayor <- b
		Letra_Mayor <- 'b'
		Menor <- a
		Letra_Menor <- 'a'
		Si b>c Entonces
			Si a>c Entonces
				Medio <- a
				Letra_Medio <- 'a'
				Menor <- c
				Letra_Menor <- 'c'
			SiNo
				Medio <- c
				Letra_Medio <- 'c'
			FinSi
		SiNo
			Mayor = c
			Letra_mayor = "c"
			Medio = b
			Letra_Medio = "b"
		FinSi
	FinSi
	Escribir 'El mayor es: ', Mayor, ' la letra ', Letra_Mayor
	Escribir 'El medio es: ', Medio, ' letra medio ', Letra_Medio
	Escribir 'El menor es: ', Menor, ' letra Menor ', Letra_Menor
FinAlgoritmo
