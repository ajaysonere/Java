import java.util.*;
public class MakeNewArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        int arr1[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }


        // for(int i=0; i<arr.length ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }

        // ArrayList newArray = new ArrayList();
        int newArray[] = new int[2];

        
        int midElementOfArray1 = (arr.length/2);
        int midElementOfArray2 = (arr1.length/2);
        
        // System.out.println(midElementOfArray1);
        // System.out.println(midElementOfArray2);
        // // newArray.add(arr[midElementOfArray1]);
        // // newArray.add(arr[midElementOfArray2]);
        newArray[0] = arr[midElementOfArray1];
        newArray[1] = arr1[midElementOfArray2];

        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        

        in.close();
    }
}
