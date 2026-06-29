import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        System.out.println(" Adding Contacts ");
        contacts.put("Alice",   "0712-345-678");
        contacts.put("Bob",     "0723-456-789");
        contacts.put("Charlie", "0734-567-890");
        contacts.put("Alice",   "0712-000-111");
        System.out.println("Contacts stored: " + contacts.size());
        System.out.println();

        System.out.println(" Looking Up Numbers ");
        String[] lookup = {"Alice", "Bob", "Diana"};
        for (String name : lookup) {
            String number = contacts.get(name);
            if (number != null) {
                System.out.println(name + " → " + number);
            } else {
                System.out.println(name + " → Not found");
            }
        }
        System.out.println();

        System.out.println(" Full Directory ");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        System.out.println(" Removing Bob ");
        contacts.remove("Bob");
        System.out.println("Bob still exists? " + contacts.containsKey("Bob"));
        System.out.println("Remaining contacts: " + contacts.size());
    }
}