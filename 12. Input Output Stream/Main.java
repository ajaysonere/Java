import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\Source Code\\Java\\12. Input Output Stream\\output.txt"));
            // wr.write("Hi , 👋 My name is Ajay\n");
            // wr.write("Nice to meet you\n");
            // wr.write("Thank you \n");
            //  wr.close();
            BufferedReader re = new BufferedReader(new FileReader("D:\\Source Code\\Java\\12. Input Output Stream\\input.txt"));
            String data = "";
            while((data = re.readLine())!= null){
                wr.write(data + "\n");
            }
            re.close();
            wr.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
