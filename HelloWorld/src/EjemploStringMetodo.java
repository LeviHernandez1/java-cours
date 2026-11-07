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
        
    }
}
