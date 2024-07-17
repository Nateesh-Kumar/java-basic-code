import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class first {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            Scanner scanner = new Scanner(file);
            if (!scanner.hasNextLine()) {
                System.out.println("file is empty");
            } else {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}


    

