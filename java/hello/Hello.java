class Animal {}
class Mammal extends Animal {}

final class Person1 {
    private final String firstname;
    private final String lastname;
    Person1(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}

record Person2(String firstname, String lastname) {}

public class Hello {
    public static void main(final String... args) {
        System.out.println("Hello, world!");
        final var p1 = new Person2("John", "Doe");
        final var p2 = new Person2("Pallavi", "Jain");
        final var p3 = new Person2("Pallavi", "Jain");
        final var p4 = p3;
        var p5 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2); // Identity, false
        System.out.println(p2 == p3); // Identity, false
        System.out.println(p3 == p4); // Identity, true

        System.out.println(p1.equals(p2)); // Equality, false
        System.out.println(p2.equals(p3)); // Equality, true
        System.out.println(p3.equals(p4)); // Equality, true

        System.out.println(p5);
        p5 = null;
        System.out.println(p5);
    }
}

class User {
    String username;
    Optional<String> password;
}
