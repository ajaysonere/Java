import java.util.*;

public class productOfTwoNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Product Of A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Product is : " +product);
        sc.close();
    }
}