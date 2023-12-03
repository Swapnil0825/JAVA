import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args)
    {
        try {
            File obj = new File("Swapnil.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
