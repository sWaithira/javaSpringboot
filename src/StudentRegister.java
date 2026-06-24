import java.util.HashSet;
import java.util.Set;

public class StudentRegister {
    public static void main(String[] args) {
        Set<String> registeredIDs = new HashSet<>();

        System.out.println(" Registering Students ");
        registeredIDs.add("STU001");
        registeredIDs.add("STU002");
        registeredIDs.add("STU003");
        boolean added = registeredIDs.add("STU001");
        System.out.println("STU001 added again? " + added);
        System.out.println("Total registered: " + registeredIDs.size());
        System.out.println();

        System.out.println(" Checking Access ");
        String[] scanned = {"STU001", "STU004", "STU002", "STU999"};
        for (String id : scanned) {
            if (registeredIDs.contains(id)) {
                System.out.println(id + " → ACCESS GRANTED");
            } else {
                System.out.println(id + " → ACCESS DENIED (not registered)");
            }
        }
        System.out.println();

        registeredIDs.remove("STU003");
        System.out.println(" After Removal ");
        System.out.println("Remaining IDs: " + registeredIDs);
        System.out.println("Total remaining: " + registeredIDs.size());
    }
}