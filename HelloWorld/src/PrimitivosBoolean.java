public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        boolean datoLogico2 = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico + ',' +  datoLogico2);

        double d = 98765.43E-3; // 98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("Dato logico: " + datoLogico );

        boolean esIgual = (3-3 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
