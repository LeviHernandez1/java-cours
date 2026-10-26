import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero valido:");
        int numeroDecimal = 0;
        // El try y catch es utilizado para manejar errores
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error  debe ingresar un número entero");
            main(args);
            // return; // Podemos usar el return pero tambien lo siguiente
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100; // El compilador de java asumira que no es entero sino binario
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        
        int numeroOctal = 0764; // El compilador de java asumira que no es entero sino octal.
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        
        int numeroHex = 0x1f4;// El compilador de java asumira que no es entero sino hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHex + "\n";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
