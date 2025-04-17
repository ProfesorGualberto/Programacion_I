Algoritmo menu_de_comidas
	op = 99
	precio_a_cobrar = 0
	// Precio de las  comidas
	precio_majadito = 30
	precio_chancho = 50
	precio_asadito = 40
	// conteo de cada plato
	contar_majadito = 0
	contar_chancho = 0
	contar_asadito = 0
	// Cobro de cada plato
	cobrar_majadito = 0
	cobrar_chancho = 0
	cobrar_asadito = 0
	Mientras (op <> 0) Hacer
		Mostrar "************************************"
		Mostrar "[1]:  Majadito de pato       -", precio_majadito ,"Bs."
		Mostrar "[2]:  Chancho al horno       -", precio_chancho , "Bs." 
		Mostrar "[3]:  Asadito Vallegrandino  -", precio_asadito,"Bs."
		Mostrar "************************************"
	    Mostrar "Digite una opciòn, [0]:Salir"
		Mostrar "*******************************"
		Leer op
		Segun op Hacer
			0: Mostrar "El consumo es: ", precio_a_cobrar
				Mostrar contar_majadito, " Majaditos de Pato a ", precio_majadito, " = ", cobrar_majadito , " Bs."
				Mostrar contar_chancho, " Chanchos al horno a ", precio_chancho, " = ", cobrar_chancho , " Bs."
				Mostrar contar_asadito, " Asaditos Vallegrandinos a ", precio_asadito, " = ", cobrar_asadito , " Bs."
			1: precio_a_cobrar = precio_a_cobrar + precio_majadito
				contar_majadito = contar_majadito + 1
				cobrar_majadito = cobrar_majadito + precio_majadito 
			2: 	precio_a_cobrar = precio_a_cobrar + precio_chancho
				contar_chancho = contar_chancho + 1
				cobrar_chancho = cobrar_chancho + precio_chancho 
			3: precio_a_cobrar = precio_a_cobrar + precio_asadito
				contar_asadito = contar_asadito + 1
				cobrar_asadito = cobrar_asadito + precio_asadito
			De Otro Modo:
				Mostrar "Elija una opciòn correcta o [0] para  Salir"
		FinSegun
	FinMientras
	Mostrar "Gracias por  su visita"
FinAlgoritmo
