public class ReverseTwoDArray {
    public static void main(String args[]){
        int arr[][] = new int[2][2];
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        int row = arr.length;
        int col = arr[0].length;
        int newArray [][] = new int[row][col];
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){
                newArray[row-i-1][col-j-1] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Reversed Array");

        for(int i=0; i<newArray.length; i++){
            for(int j=0; j<newArray[i].length; j++){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
