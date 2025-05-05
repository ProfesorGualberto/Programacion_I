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
public class Restaurante_Procedimiento {

    public static void main(String[] args)
    {
        int op = 0;   // variable que  controla las opciones principales
        int op_menu = 0;  // Variable para  controlar opciones
        // de menu de  comidas, bebidas y postres
        // Declaracion de totales
        double total_bebidas = 0;
        double total_comidas = 0;
        double total_postres = 0;
        double total_general = 0;
        // Declaracion de precios
        int pcomida_1 = 45;  // Keperi
        int pcomida_2 = 25;  // Majadito
        int pcomida_3 = 25; // Rapi
        int pbebida_1 = 20;  // Coca Cola
        int pbebida_2 = 20;  // Huari
        int pbebida_3 = 100;  // Whiski
        int ppostres_1 = 15;   // Helado
        int ppostres_2 = 25;   // Torta
        int ppostres_3 = 18;  // CupCake
        Scanner teclado = new Scanner(System.in);
        do {
            Mostrar_Menu_Principal();
            // Preguntar la opcion que  selecciona
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Menu comidas");
                    do {
                        // Menu de comidas
                        Mostrar_Menu_Comidas();
                        // Preguntar la opcion que  selecciona
                        op_menu = teclado.nextInt();
                        switch (op_menu) {
                            case 1:
                                System.out.println("Eligiò Keperi");
                                total_comidas = total_comidas + pcomida_1;
                                break;
                            case 2:
                                System.out.println("Eligió Majadito");
                                total_comidas = total_comidas + pcomida_2;
                                break;
                            case 3:
                                System.out.println("Eligió Rapi");
                                total_comidas = total_comidas + pcomida_3;
                                break;
                        }
                    } while (op_menu != 0);
                    break;
                case 2:
                    System.out.println("Menu bebidas");
                    do {
                        // Llamar  al menu comidas
                        System.out.println("┌────┤   MENÚ COMIDAS ├─────┐");
                        System.out.println("│   [1] : Coca Cola         │");
                        System.out.println("│   [2] : Cerveza Huari     │");
                        System.out.println("│   [3] : Juego de Piña     │");
                        System.out.println("├───────────────────────────┤");
                        System.out.println("│   [0] : Salir             │");
                        System.out.println("└───────────────────────────┘");
                        // Preguntar la opcion que  selecciona
                        op_menu = teclado.nextInt();
                        switch (op_menu) {
                            case 1:
                                System.out.println("Eligiò Coca Cola");
                                total_bebidas = total_bebidas + pbebida_1;
                                break;
                            case 2:
                                System.out.println("CErveza Huari");
                                total_bebidas = total_bebidas + pbebida_2;
                                break;
                            case 3:
                                System.out.println("Eligió Jugo de Piña");
                                total_bebidas = total_bebidas + pbebida_3;
                                break;
                        }
                    } while (op_menu != 0);
                    break;
                case 3:
                    System.out.println("Menu postres");
                    break;
                case 4:
                    System.out.println("El consumo es:");
                    total_general = total_bebidas + total_postres + total_comidas;
                    System.out.println("******************************");
                    System.out.println("Total Comida: " + total_comidas);
                    System.out.println("Total Bebidas: " + total_bebidas);
                    System.out.println("Total Postres: " + total_postres);
                    System.out.println("Total General: " + total_general);
                    System.out.println("******************************");
                    total_bebidas = 0;
                    total_comidas = 0;
                    total_postres = 0;
                    total_general = 0;
                    break;
            }
        } while (op != 0);

        System.out.println("SALIENDO DEL SISTEMA");
    }

        // Procedimiento para  mostrar  menu principal
    public static void Mostrar_Menu_Principal()
    {
        // Llamar  al menu principal
        System.out.println("┌────┤ MENÚ PRINCIPAL ├─────┐");
        System.out.println("│   [1] : Comidas           │");
        System.out.println("│   [2] : Bebidas           │");
        System.out.println("│   [3] : Postres           │");
        System.out.println("│   [4] : Pagar consumo     │");
        System.out.println("├───────────────────────────┤");
        System.out.println("│   [0] : Salir             │");
        System.out.println("└───────────────────────────┘");
    }
    public static void Mostrar_Menu_Comidas()
    {
        // Llamar  al menu comidas
        System.out.println("┌────┤   MENÚ COMIDAS ├─────┐");
        System.out.println("│   [1] : Keperi            │");
        System.out.println("│   [2] : Majadito          │");
        System.out.println("│   [3] : Rapi              │");
        System.out.println("├───────────────────────────┤");
        System.out.println("│   [0] : Salir             │");
        System.out.println("└───────────────────────────┘");
    }
}
