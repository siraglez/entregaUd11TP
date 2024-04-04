import java.util.HashMap;

public class ClaseCodigoProducto {
    private static HashMap<String, Integer> codigoCounter = new HashMap<>();

    public static String GeneraCodigo(String descripcion, String categoria) {
        if (descripcion == null || categoria == null || descripcion.isEmpty() || categoria.isEmpty()) {
            return "";
        }

        //Obtiene las primeras letras de las palabras clave
        String[] palabrasDescripcion = descripcion.toUpperCase().split(" ");
        String[] palabrasCategoria = categoria.toUpperCase().split(" ");

        StringBuilder codigo = new StringBuilder();

        for (String palabra : palabrasDescripcion) {
            if (!palabra.isEmpty()) {
                codigo.append(palabra.charAt(0));
            }
        }

        codigo.append("-");

        for (String palabra : palabrasCategoria) {
            if (!palabra.isEmpty()) {
                codigo.append(palabra.charAt(0));
            }
        }

        codigo.append("-");

        //Incrementa el contador de códigos para la combinación de descripción y categoría
        String key = descripcion.toUpperCase() + categoria.toUpperCase();
        int count = codigoCounter.getOrDefault(key, 0) + 1;
        codigoCounter.put(key, count);

        //Añade el número secuencial único
        codigo.append(String.format("%03d", count));

        return codigo.toString();
    }

    //Pruebas unitarias
    public static void main(String[] args) {
        //Pruebas con entradas válidas
        System.out.println(GeneraCodigo("Zapatillas deportivas", "Calzado")); //ZD-CA-001
        System.out.println(GeneraCodigo("Camiseta manga corta", "Ropa")); //CM-RO-001
        System.out.println(GeneraCodigo("Portátil", "Electrónica")); //PO-EL-001

        //Pruebas con entradas incorrectas o vacías
        System.out.println(GeneraCodigo(null, "Calzado"));
        System.out.println(GeneraCodigo("Zapatillas deportivas", ""));
        System.out.println(GeneraCodigo("", ""));
    }
}
