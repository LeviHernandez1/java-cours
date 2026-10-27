public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        // Test de rendimineto concatenar con operador (+) vs metodo concat() vs StringBuilder
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        // calculo de tiempos totales
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
            // c += a + b + "\n"; // 500 => 27ms, 1000 => 21ms, 10000 => 68ms, 100000 => 1976ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
            // sb.append(a); // esto es lo mismo que arriba
            // sb.append(b);
            // sb.append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
