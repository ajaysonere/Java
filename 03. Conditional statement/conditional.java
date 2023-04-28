import java.util.*;

public class conditional{
    public static void main(String args[]){
        System.out.println("Conditional Statement");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
           System.out.println("a is Greater than b");
        else
          System.out.println("a is less than b ");
    }
}