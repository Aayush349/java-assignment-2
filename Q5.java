class Animal{
    public void sound(){
        System.out.println("Animal make sound...");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("eating food..");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.eat();
        D1.sound();
    }
    
}
