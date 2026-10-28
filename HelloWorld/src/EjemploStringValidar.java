public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            // System.out.println(curso.toUpperCase()); // Mandara NullPointerException si no se encuentra por una validacion
            curso = "Programacion Java"; //" ";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(esBlanco == false) {
            System.out.println(curso.toUpperCase()); // Mandara NullPointerException si no se encuentra por una validacion
            // System.out.println("Bienvenido al curso".concat(curso)); // Entregara error por que esta evaluando string con un null
            System.out.println("Bienvenido al curso " + curso); // No existe error por que convierte el null en string por la prioridad de izq a der.
        }
    }
}
