
abstract class Basic {
    public abstract void run();
    public abstract void fun();
}

class ChildAbs extends Basic{
    public void run(){
        System.out.println("Abstract Method run");
     }
    public void fun(){
        System.out.println("Abstract Method fun");
    }
}

public class AbstractClass{
    public static void main(String args[]){
        ChildAbs object = new ChildAbs();
        object.fun();
        object.run();
    }
}


