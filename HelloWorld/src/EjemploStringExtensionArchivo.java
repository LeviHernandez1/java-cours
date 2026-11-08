public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.jpeg";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14)); // Consulta estatica de extencion contando los caratceres
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4)); // Consulta dinamica pero solo para casos donde la cadena dea similar a 4 caracteres como jpeg

        // Para evitar lo estatico y sea DINAMICO sin importal el nombre de la extencion
        int i = archivo.indexOf("."); // Aun que esto tiene un problema ya que encuentra el primer caracter . pero si tenemos por cualquier cosa dos puntos en la ruta debemos buscar el ultimo con lastIndexOf
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i)); // Encontramos el comodin del caracater . con el i y con esto escribira .jpeg pero para quitarlo debemos indicarle que avance uno donde lo encuentre
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1)); // Encuentra el carcter pero al encontrarlo toma donde lo encuentra mas una posicion para mostrarlo

    }
}
 