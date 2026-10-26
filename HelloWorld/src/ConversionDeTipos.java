public class ConversionDeTipos {
    public static void main(String[] args) {
        
        // ***** Converciones de tipo String a Primitivos *****
        var numeroStr = "50";
        
        // Convercion de string a int por parseInt
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realString = "98765.43e-3";
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "FalSe";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // ***** Converciones de tipo Primitivos a String *****

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroSTR = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroSTR = " + otroNumeroStr);
        
        double otroRealDoouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDoouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // ***** Converciones de tipo Primitivos a Primitivos *****

        int i = 32767;
        // Por casting o cast para formsar la convercion
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        // No podemos castear un entero a boolean
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);

        /* En tipos primitivos solo podemos hacer el cast a tipos númericos incluyendo
            los números reales, float y el double y el char.
         */
    }
}
