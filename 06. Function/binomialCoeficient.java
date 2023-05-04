import java.util.*;

public class binomialCoeficient {

    public static int findFactorail(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    public static int binomialCoeficient(int n , int r){
        int ans;
        ans = (findFactorail(n)/(findFactorail(r)*(findFactorail(n-r))));
        return ans;
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int r = in.nextInt();
       System.out.println("Binomia Coeficient : "+ binomialCoeficient(n,r));
       in.close();
    }
}
