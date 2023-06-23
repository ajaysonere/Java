class PolyDemo{
    int sum(int a ,int b){
        return a+b;
    }
    int sum(int a , int b ,int c){
        return a+b+c;
    }
}

public class CompileTImePoly {
    public static void main(String args[]){
        PolyDemo poly = new PolyDemo();
        System.out.println(poly.sum(10, 20));
        System.out.println(poly.sum(10, 20, 30));
    }
}
