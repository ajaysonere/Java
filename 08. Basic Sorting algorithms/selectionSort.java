import java.util.*;

public class selectionSort {
    public static void main(String args[]){
        // selection sort
        Scanner in = new Scanner(System.in);
        // take size as input
        int size = in.nextInt();
        // Declaring array
        int arr[] = new arr[size];
        // enter the values
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        // calling the selection sort
        selectionSortOnArray(arr);
        // print the element of the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();
    }
}
