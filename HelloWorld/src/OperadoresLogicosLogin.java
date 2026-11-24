import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // Inicializacion explicita o Dinamica
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "levi";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "54321";

        usernames[2] = "pepe";
        passwords[2] = "54321";*/

        // Inicializacion con array initializer o literal
        // Otra forma mas resumida de crear arreglos en java
        String[] usernames = {"levi", "admin", "pepe"};
        String[] passwords = {"12345" , "54321", "54321"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingresa el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){ // Se ejcutara todo este bloque siempre que esAutenticado sea true ya que si es false no lo tomara
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrecta");
            System.out.println("Lo siento, requieres autenticacion valida");
        }
    }
}
