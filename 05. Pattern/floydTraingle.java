import java.util.*;
public class floydTraingle {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 1;
        for(int i=0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(index++ + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
