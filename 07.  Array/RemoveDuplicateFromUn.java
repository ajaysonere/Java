import java.util.*;

public class RemoveDuplicateFromUn {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        // size of array
        int size = in.nextInt();
        //declare an array

        int arr[] = new int[size];
        // provided input to array
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == 0) continue;
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        in.close();
    } 
}
