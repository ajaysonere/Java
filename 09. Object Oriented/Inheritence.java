
class Box{
    double l;
    double h;
    double w;

    Box(){
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

    Box(double side){
       this.h = side;
       this.l = side;
       this.w = side;
    }

    Box(double l ,double h , double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Length is : "+ l);
        System.out.println("Height is : "+ h);
        System.out.println("Width is : "+ w);

    }

}


public class Inheritence {
    public static void main(String args[]){
        
    }
}
