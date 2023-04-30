import java.util.*;
public class positiveAndNegative{
    public static void main(String args[]){
       Scanner in  = new Scanner(System.in);
       int number = in.nextInt();
       if(number < 0){
          System.out.println("Number is Negative");
       }else{
          System.out.println("Number is Positive ");
       }
       in.close();
    }
}