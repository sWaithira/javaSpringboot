
void main() {
    int a = 10, b = 3;

    IO.println(" ARITHMETIC: ");
    IO.println("a + b = " + (a + b));
    IO.println("a - b = " + (a - b));
    IO.println("a * b = " + (a * b));
    IO.println("a / b = " + (a / b));
    IO.println("a % b = " + (a % b));

    IO.println("\n RELATIONAL: ");
    IO.println("a == b : " + (a == b));
    IO.println("a != b : " + (a != b));
    IO.println("a >  b : " + (a > b));
    IO.println("a <  b : " + (a < b));

    IO.println("\n LOGICAL: ");
    boolean isAdult = true, hasID = false;
    IO.println("isAdult && hasID : " + (isAdult && hasID));
    IO.println("isAdult hasID : " + (isAdult || hasID));
    IO.println("!isAdult: " + (!isAdult));
}
