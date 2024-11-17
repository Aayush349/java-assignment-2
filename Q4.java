class Calculator{
    Calculator(){
        System.out.println("Calculator initialized with no parameter");
    }
    Calculator(int a){
        System.out.println("Calculator initialized with one parameter");
    }
    Calculator(int a ,int b){
        System.out.println("Calculator initialized with two parameter");
    }

}
public class Q4 { 
    public static void main(String[] args) {
        Calculator O1 = new Calculator();
        Calculator O2 = new Calculator(5);
        Calculator O3 = new Calculator(2,5);

    }
 }
