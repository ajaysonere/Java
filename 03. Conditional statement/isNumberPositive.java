public class isNumberPositive {
    public static void main(String args[]){
        int number = Integer.parseInt(args[0]);
        if(number > 0){
            System.out.println("Number is Positive " + number);
        }else if(number < 0){
            System.out.println("Number is Negative " + number);
        }else{
            System.out.println("Number is Zero ");
        }
    }
}
