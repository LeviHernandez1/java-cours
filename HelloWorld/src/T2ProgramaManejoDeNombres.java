import java.util.Scanner;

public class T2ProgramaManejoDeNombres {
    static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // Solicitamos los nombres
        System.out.println("Ingresa el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingresa el tercer nombre: ");
        String nombre3 =scanner.nextLine();

        // Procesamos cada nombre usando subString y toUpperCase
        String res1 = nombre1.substring(1,2).toUpperCase() + "." + nombre1.substring(nombre1.length() - 2);
        String res2 = nombre2.substring(1,2).toUpperCase() + "." + nombre2.substring(nombre2.length() - 2);
        String res3 = nombre3.substring(1,2).toUpperCase() + "." + nombre3.substring(nombre3.length() - 2);

        // Unimos los tres resultados en una sola variable
        String resultadoFinal = res1 + "_" + res2 + "_" + res3;

        // Imprimimos el resultado final
        System.out.println("resultadoFinal = " + resultadoFinal);
    }
}

/*
* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
  Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
  Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
  Por ejemplo para Andres debe quedar como N.es
  Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
  Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
  N.es_A.ia_E.pe
* */
