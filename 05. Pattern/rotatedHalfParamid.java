import java.util.*;
public class rotatedHalfParamid {
    public static void main(String args[]){
        // rotated half paramid
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n-j >= i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
