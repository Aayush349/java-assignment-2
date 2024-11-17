class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Q22{
    public static void main(String[] args) {
        try {
            
            int a = 8;
            int b = 0; 
            int c = 21;
            int d = 0; 

            int result = calculateEquation(a, b, c, d);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateEquation(int a, int b, int c, int d) throws CustomArithmeticException {
        try {
            int part1 = a / b; 
            int part2 = c / d;
            return part1 + part2;
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic error occurred: " + e.getMessage());
        }
    }
}