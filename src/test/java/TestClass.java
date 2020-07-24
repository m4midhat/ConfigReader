import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestClass {



    public TestClass() throws FileNotFoundException {
    }

    public static void main(String args[]) throws IOException {
        Properties properties = new Properties();
        FileInputStream ip= new FileInputStream("config.properties");
        properties.load(ip);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));
    }
}
