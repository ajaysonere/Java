public class patternFour {
    public static void main(String args[]){
        System.out.println("Character Pattern ");
        char ch = 'A';
        int n = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
