public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Salutation");
        System.out.println(sb);
        System.out.println();

        // .append()
        sb.append(", Susan");
        sb.append("!");
        System.out.println("append()");
        System.out.println(sb);
        System.out.println();

        // .insert()
        sb.insert(7, "Miss ");
        System.out.println("insert()");
        System.out.println(sb);
        System.out.println();

        // .replace()
        sb.replace(7, 12, "Eng ");
        System.out.println("replace()");
        System.out.println(sb);
        System.out.println();

        // .delete()
        sb.delete(7, 11);
        System.out.println("delete()");
        System.out.println(sb);
        System.out.println();

        // .deleteCharAt()
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("deleteCharAt()");
        System.out.println(sb);
        System.out.println();

        // .reverse()
        StringBuilder rev = new StringBuilder("Mombasa");
        rev.reverse();
        System.out.println("reverse()");
        System.out.println(rev);
        System.out.println();

        // .charAt()
        StringBuilder word = new StringBuilder("Nyawira");
        System.out.println("charAt()");
        System.out.println("charAt(0) : " + word.charAt(0));
        System.out.println("charAt(3) : " + word.charAt(3));
        System.out.println();

        // .setCharAt()
        word.setCharAt(0, 'n');
        System.out.println("setCharAt()");
        System.out.println(word);
        System.out.println();

        // .substring()
        StringBuilder course = new StringBuilder("Java Spring Boot");
        System.out.println("substring()");
        System.out.println(course.substring(5));
        System.out.println(course.substring(5, 11));
        System.out.println();

        // .length() and .indexOf()
        System.out.println("length() and indexOf()");
        System.out.println("length  : " + course.length());
        System.out.println("indexOf : " + course.indexOf("Spring"));
        System.out.println();

        // .toString()
        String result = course.toString();
        System.out.println("toString()");
        System.out.println(result.getClass().getSimpleName() + ": " + result);
        System.out.println();

        // method chaining
        System.out.println("method chaining");
        String chained = new StringBuilder()
                .append("Nairobi")
                .append(", ")
                .append("Kenya")
                .insert(0, "City: ")
                .toString();
        System.out.println(chained);
    }
}