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

        // Precedencia de operadores simpre s etendra prioridad el and ante el or
        boolean b4 = i == j || k < l && m == true;
        System.out.println("b4 = " + b4); // Por el nivel de precedencia se evaluara primero el and antes que el or ignorando la regla de inzquierda a derecha
        
        boolean b5 = true || true && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false; // true por el nivel de precedencia del and
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; // false por el nivel de presedencia de los parentesis
        System.out.println("b7 = " + b7);
        
    }
}
