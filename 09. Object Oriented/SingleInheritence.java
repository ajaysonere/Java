import java.util.Scanner;

class A{
    int x;
    int y;
    int z;

    void show(){
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println("X : " + x + " Y : "+ y + " Z " + z);
    }
}

class B extends A{
    int a;
    int b;

    void show1(){
        a = 10;
        b = 12;
        System.out.println("Class B is called ");
        B s1 = new B();
        s1.show();
    }
}


public class SingleInheritence extends B{
    public static void main(String args[]){
        // System.out.println("Inheritence ");
        B s = new B();
        s.show1();
    }
}