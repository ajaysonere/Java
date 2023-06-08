import java.util.*;
public class BasicOperation {

    public static boolean isOddNum(int n){
        if(n%2 == 0)
          return false;
        return true;
    }

    public static boolean isEvenNum(int n){
        if(n%2 != 0)
           return true;
        return false;
    }

    public static int getLastDigit(int n){
        int lastDigit = Math.abs(n);
        return lastDigit%10;
    }


    public static void main(String args[]){
        boolean isOddNumber = isOddNum(10);
        boolean isEvenNumber = isEvenNum(5);
        int lastDigit = getLastDigit(-4523);
        System.out.println(isOddNumber);
        System.out.println(isEvenNumber);
        System.out.println(lastDigit);


    }
}
