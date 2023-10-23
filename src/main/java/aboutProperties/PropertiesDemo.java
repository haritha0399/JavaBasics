package aboutProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String args[]) throws IOException {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("C:\\Users\\hnavane\\IdeaProjects\\JavaBasics\\src\\main\\java\\aboutProperties\\data.properties");

        p.load(fis);

        String value = p.getProperty("owner");
        System.out.println(value);

        p.setProperty("hotelName", "Kerala Restuarant");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hnavane\\IdeaProjects\\JavaBasics\\src\\main\\java\\aboutProperties\\data.properties");
        p.store(fos,"Check for the update");


    }
}
