import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args)
            throws Exception {

        // set up new properties object
        // from file "myProperties.txt"
        FileInputStream propFile =
                new FileInputStream( "myProperties.txt");

        Properties p =
                new Properties( System.getProperties() );

        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);

        System.out.println("Usuario: " + System.getProperty("user.name"));
        System.out.println("Home: " + System.getProperty("user.home"));

    }
}
