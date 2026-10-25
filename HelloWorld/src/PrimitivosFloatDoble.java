public class PrimitivosFloatDoble {

    // static float varFlotante; // por defecto es 0.0, variable de tipo estatica

    public static void main(String[] args) {
        float realFloat = 1;
        float realFloat2 = 1.0f;
        float realFloat3 = 2120f;
        float realFloat4 = 2.12e3f; //2120f;
        float realFloat5 = 1.5e4f; // 15000f;
        float realFloat6 = 1.5e-10f; // 0.00000000015f;
        float realFloat7 = 0.00000000015f; // 1.5e-10f;
        System.out.println("realFloat = " + realFloat7);
        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        // De doble presicion double
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);
        
        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
