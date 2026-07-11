import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        System.out.println("Writing a list of students to file");
        String[] students = {
                "Susan Wanjiku - 88",
                "Alice Mwangi  - 95",
                "Bob Kamau     - 72",
                "Diana Odhiambo- 60"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt"))) {
            for (String student : students) {
                bw.write(student);
                bw.newLine();
            }
            System.out.println("Wrote " + students.length + " lines to grades.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Appending a new student");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true))) {
            bw.write("Eve Njeri      - 80");
            bw.newLine();
            System.out.println("Appended Eve Njeri");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Writing a formatted report");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))) {
            bw.write("Grade Report");   bw.newLine();
            bw.write("------------");   bw.newLine();
            for (int i = 0; i < students.length; i++) {
                bw.write((i + 1) + ". " + students[i]);
                bw.newLine();
            }
            bw.write("------------");   bw.newLine();
            bw.write("Total: " + students.length + " students");
            System.out.println("Report written to report.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}