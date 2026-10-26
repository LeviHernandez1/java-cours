import java.util.Scanner;

public class T1DetalleDeFactura {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de facturas");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Costo del primer producto : ");
        double insumo1D = scanner.nextDouble();

        System.out.println("Costo del segundo producto : ");
        double insumo2D = scanner.nextDouble();

        var totalBruto = insumo1D + insumo2D;
        double impuesto = totalBruto * 0.19d;
        double totalNeto = totalBruto + impuesto;

        System.out.println("Factura: " + nombreFactura + "\nTotal bruto :  \t" + totalBruto + ",\nImpuesto del 19%: \t" + impuesto + "\nTotal a pagar:  \t" + totalNeto);
    }
}
