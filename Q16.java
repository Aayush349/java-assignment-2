class Calculator {
    private static int oCount = 0;

    public static int getOcount() {
        return oCount;
    }


    public Calculator() {
        oCount++; 
    }

    public static int add(int a, int b) {
        return a + b;
    }

}

public class Q16 {
    public static void main(String[] args) {
        System.out.println("Addition (Static Method): " + Calculator.add(5, 3));

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println("Number of Calculator objects created: " + Calculator.getOcount());
    }
}
