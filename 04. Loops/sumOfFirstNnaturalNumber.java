public class sumOfFirstNnaturalNumber {
    public static void main(String args[]){
        int n = 5;
        int sum = 0;
        int count = 1;
        while(count <= n){
            sum += count;
            count++;
        }
        System.out.println("Sum of First N Natural Number "+ sum);

    }
}
