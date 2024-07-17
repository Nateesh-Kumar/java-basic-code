public class oddexception {
    public static void main(String[] args) {
        try {
            checkNumber(5); // replace 5 with your number
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

    
