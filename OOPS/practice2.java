import java.io.FileWriter;

public class practice2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Swapnil.txt");
            writer.write("Hii new Writing");
            
            System.out.println("Succesfully Write");
            
        } catch (Exception e) {
            
            System.out.println("Error");
        }
    }
    
}

