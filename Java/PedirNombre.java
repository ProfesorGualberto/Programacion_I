import java.util.Scanner;

public class PedirNombre
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese  su nombre:");
        String nombre = "";
        nombre = teclado.next();
        System.out.println("Hola " + nombre + " Bienvenido a la clase");
        if (  nombre.compareTo("Juan") == 0)
            // Nota: no debo hacer nombre == "Juan", porque no funciona  con cadena de caracteres.
        {
            System.out.println("Nombre correcto");
        }
        System.out.println("Ingrese  su edad:");
        int edad = 0;
        edad = teclado.nextInt();
        System.out.println("Tu edad es: "+edad);
        if (edad >= 18)
        {
            System.out.println("Eres mayor de edad ");
        }
        else
        {
            System.out.println("NO Eres mayor de edad ");
        }
    }
}
