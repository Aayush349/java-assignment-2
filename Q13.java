class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class.");
    }
}

public class Q13 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.displayGrandparent(); 
        c1.displayParent();      
        c1.displayChild();       
    }
}
