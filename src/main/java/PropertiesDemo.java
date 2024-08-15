import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties defaultProps = new Properties();

        FileInputStream in = null;

        try {
            // definir de donde se van a leer las propiedades del programa
            in = new FileInputStream("newproperties.properties");
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo de propiedades");
        }

        try {
            // cargar propiedades del programa
            defaultProps.load(in);
        } catch (IOException ex) {
            System.out.println("Error al cargar el archivo de propiedades");
        }

        try {
            in.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el archivo de propiedades");
        }

        // obtener el valor de la propiedad
        String msg = defaultProps.getProperty("mensaje");

        // obtener el valor de la propiedad
        int n = Integer.parseInt(defaultProps.getProperty("count"));

        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }

        // actualizar el valor de la propiedades
        n = n + 1;
        defaultProps.setProperty( "count", String.valueOf( n  ));

        try {
            // actualizar el archivo de propiedades
            OutputStream output = new FileOutputStream("newproperties.properties");
            defaultProps.store(output, null);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo de propiedades");
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo de propiedades");
        }
    }
}
