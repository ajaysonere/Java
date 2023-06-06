import java.util.*;
// import java.io.*;

public class FirstEvenAndOdd {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> updatedArray = new ArrayList<Integer>();

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                updatedArray.add(arr[i]);
            }
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2 != 0){
                updatedArray.add(arr[i]);
            }
        }

        Iterator it = updatedArray.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }

        in.close();
    }
}
