import java.util.*;
public class patternThree {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
