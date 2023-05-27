import java.util.*;

public class printSubAray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        //taking input
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // print all sub-array
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        in.close();
    }
}
