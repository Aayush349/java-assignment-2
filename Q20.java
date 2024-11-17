public class Q20 {
    public static void main(String[] args) {
        
        try {
            int[] Abc = new int[-5]; 
        } catch (NegativeArraySizeException e) {
            System.out.println(" Negative Abc size is not allowed...");
            System.out.println("Error Message: " + e);
        }

        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println(" Division by zero is not allowed.");
            System.out.println("Error Message: " + e);
        }

    }
}
