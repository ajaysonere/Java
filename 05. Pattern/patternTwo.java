import java.util.*;
public class patternTwo {
    public static void main(String args[]){
        // pattern two
        Scanner in = new Scanner(System.in);
        System.out.println("Pattern Two");
        int pattern = in.nextInt();
        for(int i=0 ; i<pattern; i++){
            for(int j= pattern; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
