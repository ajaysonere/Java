import java.util.*;
public class largestOfThreeNumber {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int firstNumber = in.nextInt();
       int secondNumber = in.nextInt();
       int thirdNumber = in.nextInt();
       int largest = 0;
       if(firstNumber > secondNumber && firstNumber > thirdNumber){
          System.out.println("The Greatest Number is First Number "+firstNumber);
          largest = firstNumber;
       }
       else if(secondNumber > thirdNumber){
          System.out.println("The Greatest Number is Second Number "+secondNumber);
          largest = secondNumber;
       }
       else{
          System.out.println("The Greatest Number is Third Number "+ thirdNumber);
          largest = thirdNumber;
       }
       in.close();
       String isEvenOrOdd = (largest%2==0 ? "Even" : "Odd" );
       System.out.println("Number is "+isEvenOrOdd);
    }
}
