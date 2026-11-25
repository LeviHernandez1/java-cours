import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Esta formado por tres partes o argumentos
        // La primera evalua una exprecion booleana donde si cumple una condicion devuelve un valor y si no otro valor
        // Ambos valorfes devuletos son del mismo tipo y es una vercion resumida del if
        // variable = codicion ? si_es verdadero : si es falso ;
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio  = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota en matematicas entre 2.0 - 7.0: ");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota en ciencias entre 2.0 - 7.0: ");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota en historia entre 2.0 - 7.0: ");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        // Version abrebiada
        estado =  promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        // Vercion mas compleja que hace lo mismo
        /* if (promedio >= 5.49) {
            estado = "Aprobado";
            System.out.println("estado = " + estado);
        } else {
            estado = "Reprobado";
            System.out.println("estado = " + estado);
        } */
    }
}
