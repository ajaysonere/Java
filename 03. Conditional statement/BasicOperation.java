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

    public static int getSecondLastDigit(int n){
        n = Math.abs(n);
        if(n < 10) return -1;
        n = n/10;
        return n%10;
    }

    public static int getSumOfLastDigit(int a , int b){
        a = Math.abs(a);
        b = Math.abs(b);
       return ((a%10)+(b%10));
    }
    public static void main(String args[]){
        boolean isOddNumber = isOddNum(10);
        boolean isEvenNumber = isEvenNum(5);
        int lastDigit = getLastDigit(-4523);
        int secondLastDigit = getSecondLastDigit(-4);
        int sumOfTwoLastDigit = getSumOfLastDigit(142 , -542);

        System.out.println(isOddNumber);
        System.out.println(isEvenNumber);
        System.out.println(lastDigit);
        System.out.println(secondLastDigit);
        System.out.println(sumOfTwoLastDigit);
        
        

    }
}
