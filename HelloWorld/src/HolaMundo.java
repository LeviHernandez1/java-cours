public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = "15"; // indica el tipo de dato de manera dinamica dad por el dato ingresa y el formato
        String nombre;
        nombre = "Levi";
        if(numero >10){
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        int edad = 5;

        // Comentario
        /*
        Comentario
        con mas campos
         */
    }
}
