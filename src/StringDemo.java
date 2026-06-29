public class StringDemo {
    public static void main(String[] args) {
        String name = "  Susan Nyawira  ";
        String course = "Java Spring Boot";

        System.out.println("Original values");
        System.out.println("name   : '" + name + "'");
        System.out.println("course : '" + course + "'");
        System.out.println();

        // .trim()
        String trimmed = name.trim();
        System.out.println("trim()");
        System.out.println(trimmed);
        System.out.println();

        // .length()
        System.out.println("length()");
        System.out.println("course length : " + course.length());
        System.out.println();

        // .toUpperCase() , .toLowerCase()
        System.out.println("toUpperCase() and toLowerCase()");
        System.out.println(course.toUpperCase());
        System.out.println(course.toLowerCase());
        System.out.println();

        // .charAt()
        System.out.println("charAt()");
        System.out.println("charAt(0) : " + course.charAt(0));
        System.out.println("charAt(5) : " + course.charAt(5));
        System.out.println();

        // .indexOf()
        System.out.println("indexOf()");
        System.out.println("indexOf('S')      : " + course.indexOf('S'));
        System.out.println("indexOf(\"Spring\") : " + course.indexOf("Spring"));
        System.out.println();

        // .substring()
        System.out.println("substring()");
        System.out.println(course.substring(5));
        System.out.println(course.substring(5, 11));
        System.out.println();

        // .contains()
        System.out.println("contains()");
        System.out.println("contains Spring : " + course.contains("Spring"));
        System.out.println("contains Python : " + course.contains("Python"));
        System.out.println();

        // .equals() , .equalsIgnoreCase()
        String a = "java";
        String b = "JAVA";
        System.out.println("equals() and equalsIgnoreCase()");
        System.out.println("equals          : " + a.equals(b));
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));
        System.out.println();

        // .replace()
        System.out.println("replace()");
        System.out.println(course.replace("Java", "Python"));
        System.out.println();

        // .concat()
        System.out.println("concat()");
        String full = trimmed.concat(" — Developer");
        System.out.println(full);
        System.out.println();

        // .split()
        System.out.println("split()");
        String csv = "Nairobi,Mombasa,Kisumu,Nakuru";
        String[] cities = csv.split(",");
        for (String city : cities) {
            System.out.println("City: " + city);
        }
        System.out.println();

        // .isEmpty() , .isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty() and isBlank()");
        System.out.println("empty.isEmpty() : " + empty.isEmpty());
        System.out.println("blank.isBlank() : " + blank.isBlank());
        System.out.println("blank.isEmpty() : " + blank.isEmpty());
    }
}