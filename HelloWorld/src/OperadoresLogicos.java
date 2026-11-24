public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        // En las compuestas se evaluan los pares de evaluaciones de condiciones de inzquierda a derecha
        // Considerar el nivel de presedencia agregando parentesis a lo que se desea evaluar
        boolean b3 = i == j && (k > l || m == false);
        System.out.println("b3 = " + b3);

        
        
    }
}
