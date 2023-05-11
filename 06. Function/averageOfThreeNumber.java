import java.util.*;
public class averageOfThreeNumber {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        int ans = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("Average of Three Number :"+ ans);
        in.close();
    }
}
