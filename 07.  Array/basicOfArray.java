import java.util.*;
public class basicOfArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        // creation of array
        int arr[] = new int[size]; 
        // input in array
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        // output in array
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // update an array
        for(int i=0; i<size; i++){
            arr[i] *= 2;
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
