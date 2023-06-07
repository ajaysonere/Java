import java.util.*;
public class CheckForOneAndFour {

    public static boolean isOneOrFour(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 1 && arr[i] != 4){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        // check for 1 and 4
        boolean flag = isOneOrFour(arr);
        if(flag){
            System.out.print("True");
        }else{
            System.out.print("Flase");
        }

        
        in.close();
    }
}
