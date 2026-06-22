import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = sc.nextInt();

        String grade;
        String remark;

        if (score >= 90) {
            grade  = "A";
            remark = "Excellent!";
        } else if (score >= 75) {
            grade  = "B";
            remark = "Very Good!";
        } else if (score >= 60) {
            grade  = "C";
            remark = "Keep it up!";
        } else if (score >= 50) {
            grade  = "D";
            remark = "Pass.";
        } else {
            grade  = "F";
            remark = "Please retake.";
        }

        System.out.println("Grade : " + grade);
        System.out.println("Remark: " + remark);
    }
}