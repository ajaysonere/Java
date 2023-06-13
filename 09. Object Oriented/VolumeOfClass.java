class Box{
    int width;
    int depth;
    int height;

    Box(int width , int depth , int height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    int volumeOfBox(){
       return width*depth*height;
    }
}
public class VolumeOfClass {
    public static void main(String args[]){
        Box b = new Box(10,20,30);
        System.out.println("Volumn of the object : " + b.volumeOfBox());
    }
}
