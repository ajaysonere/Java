import java.util.*;


public class passByreference {
    public static void updateArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] *= 2;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        // creating array
        int arr[] = new int[size];
        // taking input in array
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        // array is 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        updateArray(arr);
        // updated array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
