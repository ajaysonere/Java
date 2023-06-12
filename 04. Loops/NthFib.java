import java.util.*;

public class NthFib {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int NthFibNumber = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        int count = 2;
        while(count < NthFibNumber){
            a = b;
            b = c;
            c = a+b;
            count++;
        }
        System.out.println("N th Fibonacci Number : " + c);
    }
}
