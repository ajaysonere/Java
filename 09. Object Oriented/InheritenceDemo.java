class A{
    int a;
    void display(){
        System.out.println("From Class A");
    }
}

class B extends A{
    int b;
    void display1(){
        System.out.println("From class B");
    }

    void sum(){
        System.out.println("Sum is : " + (a+b));
    }
}
public class InheritenceDemo {
    public static void main(String args[]){
         A a1 = new A();
         B b1 = new B();

        b1.a = 10;
        b1.b = 20;
        b1.display();
        b1.sum();

        a1.display();
        
    }
}
