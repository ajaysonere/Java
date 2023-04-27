import java.util.*;
public class typeConversion{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      long b = a;
      System.out.println(b);

      float x = sc.nextFloat();
      int y = (int) x;
      System.out.println(y);

      char ch = '@';
      int number = (int) ch;
      System.out.println(number);

      // type promotion
      /*
        1) byte , short , char will be automatically converted in integer value
        2) long , float , doulbe will be automatically converted in max type of variable
      */

      byte number1 = 10;
      short number2 = 152;
      char char1 = 'a';
      int ans = number1+number2+char1;
      System.out.println(ans);

     sc.close();
    }
}