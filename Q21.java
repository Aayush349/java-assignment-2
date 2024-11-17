import java.util.Scanner;


class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}


public class Q21 {
    
    public static String getCapital(String country) throws NoMatchFoundException {
        switch (country.toLowerCase()) {
            case "india":
                return "New Delhi";
            case "usa":
                return "Washington, D.C.";
            case "france":
                return "Paris";
            case "japan":
                return "Tokyo";
            default:
                throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
