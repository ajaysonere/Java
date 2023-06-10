public class HowManyEvenAndOdd {
    public static void main(String args[]){
        int a = 10 ,b = 30 , c = 45 ,d = 65 , e = 25;
        int even , odd;
        even = odd = 0;
        if(a%2==0)
            even++;
        else
            odd++;
        if(b%2==0)
            even++;
        else
            odd++;
        if(c%2==0)
            even++;
        else
            odd++;

        if(d%2==0)
            even++;
        else
            odd++;
        if(e%2==0)
            even++;
        else
            odd++;
        System.out.println("Even Number :"+even + "\nOdd Number :"+odd);
    }
}
