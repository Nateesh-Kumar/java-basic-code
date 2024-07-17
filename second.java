import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
    try {
        readFile("test1.txt"); // replace "filepath" with your file path
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }
 

}