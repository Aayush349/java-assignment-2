
interface Interface1 {
    void method1A();
    void method1B();
}

interface Interface2 {
    void method2A();
    void method2B();
}

interface Interface3 {
    void method3A();
    void method3B();
}

interface Combined4 extends Interface1, Interface2, Interface3 {
    void methodCombined();
}

class class4{
    public void concreteMethod() {
        System.out.println("Method in ConcreteClass");
    }
}

class MyClass extends class4 implements Combined4 {
    
    public void method1A() {
        System.out.println("Method 1A");
    }

    public void method1B() {
        System.out.println("Method 1B");
    }

    public void method2A() {
        System.out.println("Method 2A");
    }

    public void method2B() {
        System.out.println("Method 2B");
    }

    public void method3A() {
        System.out.println("Method 3A");
    }

    public void method3B() {
        System.out.println("Method 3B");
    }

    public void methodCombined() {
        System.out.println("Combined Method");
    }
}
class InterfaceDemo {
    public static void useInterface1(Interface1 o) {
        o.method1A();
        o.method1B();
    }

    public static void useInterface2(Interface2 o) {
        o.method2A();
        o.method2B();
    }

    public static void useInterface3(Interface3 o) {
        o.method3A();
        o.method3B();
    }

    public static void useCombinedInterface(Combined4 o) {
        o.methodCombined();
    }
}


public class Q18{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        System.out.println("Using Interface1:");
        InterfaceDemo.useInterface1(myClass);

        System.out.println("Using Interface2:");
        InterfaceDemo.useInterface2(myClass);

        System.out.println("Using Interface3:");
        InterfaceDemo.useInterface3(myClass);

        System.out.println("Using CombinedInterface:");
        InterfaceDemo.useCombinedInterface(myClass);

        System.out.println("Using ConcreteClass Method:");
        myClass.concreteMethod();
    }
}
