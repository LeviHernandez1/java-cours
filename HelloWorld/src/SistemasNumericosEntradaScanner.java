// import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Entrada por terminal de la consola
        System.out.println("Ingrese un numero entero valido:");
        // String numeroStr = scanner.nextLine(); // obtener la linea que el usuario ingreso en la terminal del tipo String
        int numeroDecimal = 0;
        // El try y catch es utilizado para manejar errores
        try {
            numeroDecimal = scanner.nextInt(); // Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) { // Esta es la vercion completa de Exception pero podemos usar solamente "Exception" y funcionara por que e suna hija de la general
            System.out.println("Error  debe ingresar un número entero");
            main(args);
            // return; // Podemos usar el return pero tambien lo siguiente
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHex + "\n";
        System.out.println(mensaje); // Mostramos salida en consola
    }
}
