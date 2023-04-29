import java.util.*;
public class largestOfThreeNumber {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int firstNumber = in.nextInt();
       int secondNumber = in.nextInt();
       int thirdNumber = in.nextInt();
       if(firstNumber > secondNumber && firstNumber > thirdNumber){
          System.out.println("The Greatest Number is First Number "+firstNumber);
       }
       else if(secondNumber > firstNumber && secondNumber > thirdNumber){
          System.out.println("The Greatest Number is Second Number "+secondNumber);
       }
       else{
          System.out.println("The Greatest Number is Third Number "+ thirdNumber);
       }
       in.close();
    }
}
