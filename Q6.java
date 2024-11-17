class Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
       System.out.println("Sum of two integers : "+c1.add(10, 20));
       System.out.println("Sum of three integers : "+c1.add(10, 20,30));
       System.out.println("Sum of two double : "+c1.add(10.2, 20.5));
    }   
}
    

