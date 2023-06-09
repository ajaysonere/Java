class Temp{
    int x;
    int y;

    void addition(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x+y);
    }
}

public class BasicClass {
    Temp a = new Temp();
    a.addition(10,20);
}
