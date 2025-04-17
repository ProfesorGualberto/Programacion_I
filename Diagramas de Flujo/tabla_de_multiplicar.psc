Algoritmo tabla_de_multiplicar
	
	Para i = 1 Hasta 10 con Paso 5 Hacer
		Mostrar "Tabla del ", i
		Mostrar "**********************"
		Para j=1 Hasta 10 Hacer
			multiplicacion = i * j
			Mostrar i," x " ,j , " = ", multiplicacion, "   ", i+1, " x " ,j , " = ", multiplicacion*(i+1), "   ",i+2, " x " ,j , " = ", multiplicacion*(i+2) , "   ",i+3, " x " ,j , " = ", multiplicacion*(i+3), "   ",i+4, " x " ,j , " = ", multiplicacion*(i+4)
		FinPara
		Mostrar "**********************"
	FinPara
FinAlgoritmo
