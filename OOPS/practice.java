
// Import the File class
import java.io.*;
import java.util.* ;
 
public class practice {
    public static void main(String[] args) {
        try {
            File obj = new File("Swapnil.txt");
            if (obj.createNewFile()) {
                System.out.println("File created :" + obj.getName());
            } else {
                System.out.println("File allready Exist");
            }
            
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
    
}
