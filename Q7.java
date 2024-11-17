
class Parent {
    public  void show() { 
        System.out.println("Parent's show()"); 
    }
}

class Child extends Parent {
    
    @Override
    public void show(){
        System.out.println("Child's show()");
    }
}

class Q7{
    public static void main(String[] args){
        Parent O1 = new Parent();
        O1.show();
        Parent O2 = new Child();
        O2.show();
    }
}

       


   