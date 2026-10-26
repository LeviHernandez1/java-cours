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

        
    }
}
