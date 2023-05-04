import java.util.*;
public class factorialOfNumber {

    public static int findFactorail(int num){
        int ans  = 1;
        while(num != 0){
            ans *= num;
            num--;
        }
        return ans;
    }
    public static void main(String args[]){
        // factorial
        Scanner in = new Scanner(System.in);
        int nubmer = in.nextInt();
        int factorial = findFactorail(nubmer);
        System.out.println("Factorial Of Number is : "+ factorial);

    }
}
