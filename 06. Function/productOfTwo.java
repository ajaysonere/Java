import java.util.*;
public class productOfTwo {

    public static int productOfTwoNumber(int a , int b){
        int product  = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int product = productOfTwoNumber(a,b);
        System.out.println("Product is " + product);
        in.close();
    }
}
