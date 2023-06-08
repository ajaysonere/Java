public class BasicOperation {

    public static boolean isOddNum(int n){
        if(n%2 == 0)
          return false;
        return true;
    }

    public static boolean isEvenNum(int n){
        if(n%2 != 0)
           return true;
        return false;
    }
    public static void main(String args[]){
        boolean isOddNumber = isOddNum(10);
        boolean isEvenNumber = isEvenNum(5);

    }
}
