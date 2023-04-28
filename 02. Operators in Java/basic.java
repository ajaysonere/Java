public class basic{
    public static void main(String args[]){
        // operators in java
        // 1. Arithmetic operator
            // Binary operators
            int a = 10;
            int b = 20;
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
            // uninary operators
            System.out.println("Unary Operator");
            int c = a++;
            System.out.println("value of a :"+a);
            System.out.println( "Value of c :"+c);
        // 2. Relational operator
           // less than operator
           if(a <= b){
              System.out.println("A is Less then B");
           }else{
              System.out.println("B is Greater than A");
           }
           // equal  operator
           System.out.println("A is equal to B" + (a==b));
           // not equal operator
           System.out.println("A is not equal to B" + (a!=b));
         // 3. Logical Operator
            System.out.println((3>2) && (5<10));
            System.out.println((3>2) || (5 > 10) );
            System.out.println(!(5>3));
         // 4. Assignment Operators
            a += 10;
            System.out.println("Value of A"+a);
    }
}