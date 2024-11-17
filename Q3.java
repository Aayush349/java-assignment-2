class Xyz{
    int value;
    Xyz(int x){
        value = x;
        System.out.println("Parameterized constructor called");
        System.out.println("Value :"+value);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Xyz obj = new Xyz(05);
     } 
 }