public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Levi Marin Hernandez";

        // Concatenacion con strings
        String detalle = curso + " con alumno incrito " + alumno;
        System.out.println(detalle);

        // Concatenacion con operadores
        int numeroA = 10;
        int numeroB = 5;
        
        System.out.println(detalle + numeroA + numeroB); // Operaciones por evaluacion de izq a der gana la procedencia Strin por ser primero
        System.out.println(numeroA + numeroB + detalle);
        System.out.println(detalle + (numeroA + numeroB));
        
        // Concatenacion con metodo String
        String detalle2 = curso.concat(alumno); // Retonara otra instancia no sera el mismo que curso y alumno por lo que son inmutables
        System.out.println("detalle2 = " + detalle2);

        String detalle3 = curso.concat(" alumno / ".concat(alumno));
        System.out.println("detalle3 = " + detalle3);

        String detalle4 = curso.concat(" con ").concat(alumno) ;
        System.out.println("detalle4 = " + detalle4);
    }
}
