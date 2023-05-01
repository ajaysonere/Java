import java.util.*;

public class reverseANumber{
    public static void main(String args[]){
        // reverse a number
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        while(n>0){
           int temp = n%10;
           result = result*10+temp;
           n = n/10;
        }
        System.out.println("Reverse of a number is : "+ result);
        in.close();
    }
}