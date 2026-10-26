public class SistemasNumericos {
    public static void main(String[] args){
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // El compilador de java asumira que no es entero sino binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        
        int numeroOctal = 0764; // El compilador de java asumira que no es entero sino octal.
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        
        int numeroHex = 0x1f4;// El compilador de vaja asumira que no es entero sino hexadecimal
        System.out.println("numeroHex = " + numeroHex);
    }
}
