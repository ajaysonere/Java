public class SearchInMatrix {
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        int index = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = Integer.parseInt(args[index++]);
            }
        }

       
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] >largest){
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("Largest Element is " + largest);

    }
}
