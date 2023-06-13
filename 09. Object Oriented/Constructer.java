class Sample{
    int id;
    Sample(){
        id = 101;
        System.out.println("Default constructer " + id);
    }
    Sample(int id){
       this.id = id;
       System.out.println("Parameterized Constructer " +id);
    }
    void display(){
        System.out.println("Instance id "+ id);
    }
}

public class Constructer {
    public static void main(String args[]){
        Sample s1  = new Sample(10);
        s1.display();
    }
}
