public class OperadoresUnarios {
    public static void main(String[] args) {

        // Los operadores unarios sirven para cambiar el signo a un valor sin alterar el valor solo el signo
        int i = -5;

        int j = +i; // j = (1)*i
        System.out.println("j = " + j); // => -5
        int k = -i; // K = (-1)*i
        System.out.println("k = " + k); // => 5

        i = 6;
        j = +1;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);
    }
}
