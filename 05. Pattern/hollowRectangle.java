import java.util.*;

public class hollowRectangle {
    public static void main(String args[]){
        // hollow rectangle
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // if(i == 0 || i == n-1){
                //     System.out.print("* ");
                // }
                // else if(j == 0 || j == n-1){
                //     System.out.print("* ");
                // }else{
                //     System.out.print("  ");
                // }
                if(i==0 || i== n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
