import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("input_sample.txt")) {
            fos.write("Hello Susan!\nWelcome to new Java file.".getBytes());
            System.out.println("Sample file created");
        } catch (IOException e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Reading file with FileInputStream");
        try (FileInputStream fis = new FileInputStream("input_sample.txt")) {

            int byteData;
            StringBuilder content = new StringBuilder();

            while ((byteData = fis.read()) != -1) {
                content.append((char) byteData);
            }

            System.out.println("File contents:");
            System.out.println(content.toString());
            System.out.println();
            System.out.println("Total bytes read: " + content.length());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Stream closed automatically by try-with-resources");
        }
        System.out.println();

        System.out.println("Reading a file that does not exist");
        try (FileInputStream fis = new FileInputStream("missing.txt")) {
            System.out.println("This will not run");
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}