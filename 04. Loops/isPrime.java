import java.util.*;
public class isPrime {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        // assuming the number is prime 
        boolean isPrime = true;
        
        if(number == 2){
            System.out.println("Number is prime ");
        }else{
            // checking is number is prime or not
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println("Number is prime ");
            } else {
                System.out.println("Number is not prime");
            }
        }

    }
}
