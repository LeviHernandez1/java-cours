public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A';
        // Podemos tener un caracter unicode
        char caracter2 = '\u0040'; // representan el @
        char decimal = 64; // Codigo equivalente decimal pintara arroba
        System.out.println("caracter = " + caracter2);
        System.out.println("decimal = " + decimal);
        System.out.println("¿Decimal es igual a caracter?  \n" + (decimal == caracter2));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("¿Simbolo es diferente a caracter?  \n" + (simbolo != caracter2));

        char espacio = ' ';
        char espacio2 = '\u0020'; // espacio con codigo unitcode
        char retroceso = '\b'; // eliminara un caracter
        char tabulador = '\t'; // tabulador
        char nuevaLinea = '\n'; // salto de linea
        char retornoCarro = '\r'; // retorno carro

        System.out.println("Tipo char corresponde en \tbyte a:" + retornoCarro + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char: " + Character.MIN_VALUE);

        // Formas diferentes de manejar los caracteres
        System.out.println("char corresponde en byte = " + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("Sin importar el Sistema Operativo = " + System.getProperty("line.separator") + Character.BYTES); // predefinidas en la maquina virtual de java
        System.out.println("Sin importar el Sistema Operativo = " + System.lineSeparator() + Character.BYTES); // atajo
        /*
        var caracterVar = '\u0040';
        System.out.println("caracterVar = " + caracterVar);
         */
    }
}
