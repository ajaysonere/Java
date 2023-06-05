import java.util.*;

public class NewVersionOfArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 10){
                arr[i] = 0;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        int ans[] = new int[size];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                ans[index++] = arr[i];
            }
        }

        System.out.println();

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        in.close();
    }
}
