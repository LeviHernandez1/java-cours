import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "levi";
        String password = "12345";

        String username2 = "admin";
        String password2 = "54321";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingresa el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        if ( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p))) {
            esAutenticado = true;
            //System.out.println("Bienvenido al sistema " + esAutenticado);
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
        if (esAutenticado){ // Se ejcutara todo este bloque siempre que esAutenticado sea true ya que si es false no lo tomara
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requieres autenticacion valida");
        }
    }
}
