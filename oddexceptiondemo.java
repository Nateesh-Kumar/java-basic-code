public class oddexceptiondemo {
    public static void main(String[] args) {
        try {
            checkNumber(6); // replace 5 with your number
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int num) {
        if (num % 2 != 0) {
            throw new RuntimeException("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
