import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Positive {


    public static void main(String[] args) {
        try {
            readNumbersFromFile("test.txt"); // replace "numbers.txt" with your file name
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readNumbersFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                throw new RuntimeException("Found positive number: " + num);
            }
            else{
                System.out.println("found negative number: " +num);
            }
        }
    }
}


