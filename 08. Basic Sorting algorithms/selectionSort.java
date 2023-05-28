import java.util.*;

public class selectionSort {

    public static void selectionSortOnArray(int arr[]){
        // selection sort
        for(int pos = 0; pos<arr.length-1; pos++){
            int minPosition = pos;
            for(int j=pos+1; j<arr.length; j++){
                if(arr[j] < arr[minPosition]){
                    minPosition = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[minPosition];
            arr[minPosition] = temp;
        }
    }
    public static void main(String args[]){
        // selection sort
        Scanner in = new Scanner(System.in);
        // take size as input
        int size = in.nextInt();
        // Declaring array
        int arr[] = new int[size];
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
