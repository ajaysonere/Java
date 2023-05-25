import java.util.Scanner;

public class printPair {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // print pair
        for(int i=0; i<arr.length-1; i++){
            for(int  j=i+1; j<arr.length; j++){
                System.out.print("{"+arr[i] +" "+arr[j]+"}");
            }
            System.out.println();
        }
        in.close();
    }
}
