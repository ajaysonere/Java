import java.util.*;

public class squarePattern{
    public static void main(String args[]){
        // print square pattern
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Using the for loop");
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Using the while loop");
        int i =0;
        while(i < n){
            int j = 0;
            while(j<n){
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
        in.close();
    }
}