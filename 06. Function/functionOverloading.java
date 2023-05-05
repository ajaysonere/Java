import java.util.*;
public class functionOverloading {

    public static int sum(int a , int b){
        return a+b;
    }

    // function overloading by parameter

    public static int sum(int a, int b ,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        // function overLoading
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Sum :) "+ sum(a , b));
        System.out.println("Sum :) "+ sum(a, b, c));
        in.close();
    }
}
