import java.util.*;
public class isPalindrom {

    public static boolean isPal(int number){
        int check = number;
        int ans = 0;
        while(number > 0){
            int temp = number%10;
            ans = ans*10+temp;
            number = number/10;
        }
        return (check == ans);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean isPalindrom = isPal(number);
        if(isPalindrom){
            System.out.println("Number is Palindrom ");
        }else{
            System.out.println("Number is not Palindrom ");
        }
        in.close();
    }
}
