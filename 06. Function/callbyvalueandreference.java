public class callbyvalueandreference {

    public static void callByValue(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]){
        System.out.println("Call by value and call by reference ");
        int a = 10;
        int b = 5;
        callByValue(a,b);
        System.out.println("Call by Value : " +  "a =  " + a + " b = " + b );
    }
}
