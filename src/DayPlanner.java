import java.util.Scanner;

public class DayPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        String activity;
        switch (day) {
            case 1:
                activity = "Monday   → Team standup meeting";
                break;
            case 2:
                activity = "Tuesday    → Code review session";
                break;
            case 3:
                activity = "Wednesday   → Architecture planning";
                break;
            case 4:
                activity = "Thursday → Testing & QA";
                break;
            case 5:
                activity = "Friday   → Deployment day!";
                break;
            case 6:
            case 7:
                activity = "Weekend  → Rest & personal projects";
                break;
            default:
                activity = "Invalid day number";
        }

        System.out.println(activity);
    }
}