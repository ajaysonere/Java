import java.util.*;
public class basicfunction {

    public static void printHelloWorld(){
        System.out.println("Hello world ");
    }

    public static int addition(int a , int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        printHelloWorld();
        int result = addition(a, b);
        System.out.println("Result is :"+ result);
        in.close();

    }
}
