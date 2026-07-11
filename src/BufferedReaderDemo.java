import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"))) {
            bw.write("Susan Wanjiku - Java");   bw.newLine();
            bw.write("Alice Mwangi - Python");  bw.newLine();
            bw.write("Bob Kamau - Spring Boot"); bw.newLine();
            bw.write("Diana Odhiambo - SQL");   bw.newLine();
            System.out.println("students.txt created");
        } catch (IOException e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Reading every line");
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Only lines containing Java");
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Java")) {
                    System.out.println("Match: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Reading entire file into one String");
        StringBuilder all = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                all.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(all.toString());
    }
}