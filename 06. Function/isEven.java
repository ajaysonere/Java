import java.util.*;

public class isEven {

    public static boolean iseven(int number){
        return number%2==0;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(iseven(number)){
            System.out.println("Number is Even ");
        }else{
            System.out.println("Number is Odd ");
        }
        in.close();
    }
}
