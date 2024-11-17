class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class");
    }
}

public class Q8{
    public static void main(String[] args) {
        Parent.display();  
        Child.display();  
        Parent p = new Parent();
        Parent c = new Child();
        p.display();  
        c.display();   
    }}