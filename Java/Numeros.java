import java.util.Scanner;

/*
     Programa:   Numeros
     Autor:      Juan Perez
     Descripción: Este  programa calcula el mayor  entre  dos  nùmeros.
     Fecha creación:   1/4/2025
     Fecha ultima modificación:    14/4/2025
 */
public class Numeros
{
    public static void main(String[] args)
    {
        // Este  es un comentario, viene  con los  dos  slash.
        // Describe el proceso o una  acción que  voy a  ralizar.
        /*
           Este  es un comentario largo, inicia del de  slash asterisco
           hasta  el cierre  con asterisco slash.
           Aqui  puedo colocar  un comentario bastante  extenso.
         */
        /* ***********************************************
         DECLARACIÓN DE VARIABLES
         byte: Un entero de 8 bits. Rango: -128 a 127.
        short: Un entero de 16 bits. Rango: -32,768 a 32,767.
        int: Un entero de 32 bits. Rango: -2^31 a 2^31-1.
        long: Un entero de 64 bits. Rango: -2^63 a 2^63-1.
        float: Un número en coma flotante de precisión simple de 32 bits.
        double: Un número en coma flotante de precisión doble de 64 bits.
        char: Un solo carácter de 16 bits. Representa caracteres Unicode.
        boolean: Representa un valor de verdad, true o false.
         *********************************************** */
        int  variable_entera;   // variable  entera
        int variable_entera_con_asignacion = 15;    // variable entera con asignacion
        float v_flotante;    // variable  flotante
        double v_double = 123456789.987654321;
        char un_caracter = 'A';
        boolean apagado ;
        //  IMPRESION DE LAS VARIABLES UTILIZADAS
        // println: Imprime y al final le da un Intro.
        variable_entera = 400;
        System.out.println("1ra variable entera: "+variable_entera);
        System.out.println("2da variable entera: "+variable_entera_con_asignacion);
        // debo asignar  un valor  a mi variable flotante
        v_flotante = 12345.22252f;
        System.out.println("Variable flotante: "+v_flotante);
        System.out.println("Variable double: "+v_double);
        System.out.println("Char: "+un_caracter);
        // Asignar  un valor a variable boolean apagado
        apagado = true;
        System.out.println("Boolean (Logico)-> verdadero: "+apagado);
        apagado = false;
        System.out.println("Boolean (Logico)-> falso: "+apagado);
        // uso de las funciones
        ejemplo_uno();
    }

    /* Proceso del 1er ejemplo
     Uso de numeros enteros.
     * Comparación de mayor y menor entre dos numeros
    */
    public static void ejemplo_uno()
    {
        System.out.println("Mi primer ejemplo con enteros");
        Scanner teclado = new Scanner(System.in);
        // declaracion de mis  dos  variables para  el ejemplo
        int a;
        int b;
        String mensaje = "";
        System.out.println("Ingrese  el primer valor entero");
        a =teclado.nextInt();
        System.out.println("Ingrese  el segundo valor entero");
        b =teclado.nextInt();
        if (a >b)
        {
            mensaje = "A es mayor que B";
        }
        if ( a==b)
        {
            mensaje = "A es igual que B";
        }
        if ( a < b)
        {
            mensaje = "B es mayor que A";
        }
        System.out.println(mensaje);

    }
}












