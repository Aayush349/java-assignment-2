class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class Q25 {
    public static void validateCredentials(String username, String password, String confirmPassword) throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }
        System.out.println("Credentials are valid.");
    }

    public static void main(String[] args) {
        try {
            String username = "user"; // Example username
            String password = "password123"; // Example password
            String confirmPassword = "password123"; // Example confirm password
            validateCredentials(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
