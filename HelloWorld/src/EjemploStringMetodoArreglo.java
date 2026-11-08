public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        // Esto nos imprimira el hash del objeto no cada elemento del arreglo
        System.out.println("trabalenguas = " + trabalenguas.toCharArray()); // Convertimos el string a un arreglo de caracteres del tipo char, es de referencia
        // Para mostrar elementos de la instancia del arreglo creada podremos hacerlo mediante siclos for por ejemplo
        char[]arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println("i = " + arreglo[i]);
        }

        // Ejemplo dos
        // Se construira un arreglo de caracteres que esten delimitados en este caso por las "a" ademas de que mostrara una referencia hash
        System.out.println("trabalenguas = " + trabalenguas.split("a")); // convertir a un arreglo string pero como una exprecion regular segun un parametro.

        String[] arreglo2 = trabalenguas.split("a");// Sera de tipo string por que podemos almacenar en cada espacio mas de un caracter
        int l = arreglo2.length;
        for (int j=0; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        // Ejemplo 3
        String archivo = "aguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");// El punto por ser un caracter especial propio de expreciones regulares por lo que debemos avisar que se tomara el caracter saltandolo con \\. de esta manera.
        // Tambien podemos especificar en la consulta en ves del salto de linea un caracter literal con corchetes y el caracter dentro [.], de hecho podemos agregar paraetros dentro del corchete.
        l = archivoArr.length;
        for (int j=0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
    }
}
