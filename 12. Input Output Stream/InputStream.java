
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStream {
    public static void main(String args[]){
        try {
            String text = "My name is Ajay Sonere .";
            Path input = Path.of("D:/Source Code/Java/12. Input Output Stream/input.txt");
            // Files.writeString(input, text);
            String content = Files.readString(input); 
            System.out.println(content + text);
        } catch (Exception e) {
            
        }
    }
}
