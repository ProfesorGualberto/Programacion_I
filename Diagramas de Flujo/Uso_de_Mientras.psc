Algoritmo Uso_de_Mientras
	op = 99     
	Mientras (op <> 0) Hacer
		Mostrar "*****   MENU PRINCIPAL ****"
		Mostrar "(1): SUMAR"
		Mostrar "(2): RESTAR"
		Mostrar "(3): MULTIPLICAR"
		Mostrar "(4): DIVIDIR"
		Mostrar "(0): SALIR"
		Mostrar "DIGITE OPCION: "
		Leer op
		SI (op>4 O op<0) Entonces
			Mostrar "Ingrese una opcion correctamente"
		FinSi
		SI(op=1) Entonces
			// Se trata de Suma
			Mostrar "OPERACION DE SUMA"
			Mostrar "Ingrese  el 1er nùmero"
			Leer numero_1
			Mostrar "Ingrese  el 2do nùmero"
			Leer numero_2
			resultado = numero_1 + numero_2
			Mostrar "La suma de ", numero_1, " + ", numero_2 , " es ", resultado
		FinSi
		SI(op=2) Entonces
			// Se trata de Resta
			Mostrar "OPERACION DE RESTA"
			Mostrar "Ingrese  el 1er nùmero"
			Leer numero_1
			Mostrar "Ingrese  el 2do nùmero"
			Leer numero_2
			resultado = numero_1 - numero_2
			Mostrar "La resta de ", numero_1, " - ", numero_2 , " es ", resultado
		FinSi
		SI(op=3) Entonces
			// Se trata de Multiplicacion
			Mostrar "OPERACION DE MULTIPLICACION"
			Mostrar "Ingrese  el 1er nùmero"
			Leer numero_1
			Mostrar "Ingrese  el 2do nùmero"
			Leer numero_2
			resultado = numero_1 * numero_2
			Mostrar "La multiplicacion de ", numero_1, " x ", numero_2 , " es ", resultado
		FinSi
		SI(op=4) Entonces
			// Se trata de Division
			Mostrar "OPERACION DE DIVISION"
			Mostrar "Ingrese  el 1er nùmero"
			Leer numero_1
			Mostrar "Ingrese  el 2do nùmero"
			Leer numero_2
			resultado = numero_1 / numero_2
			Mostrar "La division de ", numero_1, " / ", numero_2 , " es ", resultado
		FinSi
	FinMientras
	
FinAlgoritmo



