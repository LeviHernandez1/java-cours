public class EjemploStringMetodo {
    public static void main(String[] args) {
        String nombre = "Levi";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        // Comparar string a nivel de valor no de instancia
        System.out.println("nombre.equals(\"Levi\") = " + nombre.equals("Levi"));
        System.out.println("nombre.equals(\"levi\") = " + nombre.equals("levi"));
        System.out.println("nombre.equalsIgnoreCase(\"levi\") = " + nombre.equalsIgnoreCase("levi"));
        System.out.println("nombre.compareTo(\"Levi\") = " + nombre.compareTo("Levi")); // Orden lexico grafico, si el valor da cero el valor es identico siempre
        System.out.println("nombre.compareTo(\"levi\") = " + nombre.compareTo("levi"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));// Comvertir string en caracteres u obtener un caracter en particular del string
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre = " + nombre.substring(1)); // Obtener una parte del string
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        // Metdos segunda parte
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.index = " + trabalenguas.indexOf('a')); // Permite saber si existe un caracter dentro de un string y retonra el indice de la posicion en el string con un valor
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // Busca dentro del string la ultima ocurrencia mostrando la posicion en el string
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('l')); // Si no existen concurrencia en el string nos retornara un valor negativo, siempre si ternora una posicion mayor a cero existe y si es menor a cero no existe, hacepra "" y '' dependiendo lo que se requiera.
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas")); // Aca siempre debemos especificar que es un string lo que se busca por las "", ademas de que nos retornara un buleano True o False
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); // Recibe secuencias de carcateres y nos indica true o false al preguntar si el string comienza con la secuencia de caracteres solicitada
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas")); // Recibe secuencias de carcateres y nos indica true o false al preguntar si el string termina con la secuencia de caracteres solicitada
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); // Este metodo quitara los espacio adelante y atras en el string
    }
}
