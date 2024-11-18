class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        try {
            String name = "John Doe"; // Example name
            int age = -5; // Example age
            Person person = new Person(name, age);
            person.display();
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
