import java.util.Locale;
import java.util.Scanner;

public class Formulario {

    public static void main(String[] args){
        String nombre,apellido,hobbie,editor_preferido,SO;
        int edad;

        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido= sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad= sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su hobbie: ");
        hobbie= sc.nextLine();
        System.out.print("Ingrese su editor de código favorito: ");
        editor_preferido= sc.nextLine();
        System.out.print("Ingrese su sistema operativo: ");
        SO= sc.nextLine();

        System.out.println("\n");//Salto de linea

        System.out.println("--------------------------------------------");
        System.out.println("*          BIENVENIDO AL SISTEMA           *");
        System.out.println("--------------------------------------------");
        System.out.println("Usted es: "+nombre.toUpperCase()+" "+apellido.toUpperCase());
        System.out.println("Su edad es: "+edad+" años ");
        System.out.println("Su hobbie es: "+hobbie);
        System.out.println("Su editor de código favorito es: "+editor_preferido);
        System.out.println("Su sistema operativo es: "+SO);
        System.out.println("--------------------------------------------");

    }

}
