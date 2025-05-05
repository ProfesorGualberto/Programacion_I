import java.util.Scanner;

// Funcion que me  indica  si  el valor enviado es Par o Impar
public class ReconocerPar_Impar
{
    public static void main (String[] arg)
    {
        int valor;
        String mensaje="";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un valor");
        valor = teclado.nextInt();
        mensaje = DevolverParImpar(valor);
        System.out.println(mensaje);
        // Usar  un procedimiento
        System.out.println("***  con procedimiento ***");
        EsPar_Impar(valor);
        // Devolver el tipo de variable que es valor
        System.out.println(esNumerica(Integer.toString(valor)));
    }
    // Funcion que  devuelve  el mensaje  de acuerdo a
    //  si es par  o impar.
    public static String DevolverParImpar(int valor_recibido)
    {
        if(valor_recibido % 2 ==0)
        {
            return "Valor PAR";
        }
        return "Valor IMPAR";
    }
    // Procedimiento para mostrar  si un mnumero es par o impar
    public static void EsPar_Impar(int valor_recibido)
    {
        if(valor_recibido % 2 ==0)
        {
            System.out.println("Valor PAR");
        }
        else
         {
            System.out.println("Valor IMPAR");
        }
    }
    // Funcion que  devuelve  el tipo de variable


    public static boolean esNumerica(String cadena) {
        try {
            Integer.parseInt(cadena); // Intenta convertir a entero
            return true;
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(cadena); // Intenta convertir a doble
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
}
