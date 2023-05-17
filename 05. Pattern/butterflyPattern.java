import java.util.*;

public class butterflyPattern {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1 ; i<=n*2-1; i++){
            if(i<=n){
                int space = n*2-i*2;
                for(int j=1 ; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=0; j<space; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                int space = i*2-n*2;
                for(int j=0; j<n-(i-n); j++){
                    System.out.print("*");
                }
                for(int j=0; j<space; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<n-(i-n); j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
