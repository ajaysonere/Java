import java.util.*;
public class areaOfCircle{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Area of Circle ");
       float radius = sc.nextFloat();
       float areaOfCircle = 3.14f*radius*radius;
       System.out.println("Area is "+areaOfCircle);
       sc.close();
    }
}