import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {

        System.out.println("Writing to a file");
        String content = "Hello Susan!\nThis was written by FileOutputStream.\nLine three.";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Written successfully");
            System.out.println("Bytes written: " + bytes.length);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Appending to the same file");
        String extra = "\nThis line was appended.";

        try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
            fos.write(extra.getBytes());
            System.out.println("Appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Writing one character at a time");
        try (FileOutputStream fos = new FileOutputStream("letters.txt")) {
            String word = "SUSAN";
            for (char c : word.toCharArray()) {
                fos.write(c);
            }
            System.out.println("Wrote: " + word + " to letters.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}