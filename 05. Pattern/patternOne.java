import java.util.*;

public class patternOne{
    public static void main(String args[]){
        // patter in java
        Scanner in = new Scanner(System.in);
        System.out.println("Pattern 01");
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}