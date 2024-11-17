
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class Q24 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter the candidate's name and age.");
            return;
        }

        String name = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
            checkAge(name, age);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid number.");
        }
    }

    public static void checkAge(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old for the recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young for the recruitment.");
        } else {
            System.out.println("Candidate " + name + " is eligible for the recruitment.");
        }
    }
}
