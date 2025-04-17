import java.util.Scanner;

/*  --------------------------------------------
     Título:   Restaurante
     Descripciòn: Programa que muestra  menus de acuerdo a la selecciòn,
     se toma de ejemplo el menu de un restaurante.
     El usuario hace pedidos  de comida, bebida  y postres y el
     programa  calcula  lo que  debe  cancelar.
     Fecha de creaciòn: 17-abril-2025
     Autor: Clase de Programaciòn I
     --------------------------------------------
  */
public class Restaurante
{
    public static void main(String[] args)
    {
        int op = 0;   // variable que  controla las opciones principales
        Scanner teclado = new Scanner(System.in);
        do {
            // Llamar  al menu principal
            System.out.println("┌────┤ MENÚ PRINCIPAL ├─────┐");
            System.out.println("│   [1] : Bebidas           │");
            System.out.println("│   [2] : Comidas           │");
            System.out.println("│   [3] : Postres           │");
            System.out.println("│   [4] : Pagar consumo     │");
            System.out.println("├───────────────────────────┤");
            System.out.println("│   [0] : Salir             │");
            System.out.println("└───────────────────────────┘");
            // Preguntar la opcion que  selecciona
            op = teclado.nextInt();
            switch (op)
            {
                case 1:
                    System.out.println("Menu comidas");
                    break;
                case 2:
                    System.out.println("Menu bebidas");
                    break;
                case 3:
                    System.out.println("Menu postres");
                    break;
            }
        }while( op != 0);
        System.out.println("SALIENDO DEL SISTEMA");
    }
}








