public class vowels {
    public static void main(String[] args) {
        try {
            checkString("Hello"); // replace "Hello" with your string
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String str) throws RuntimeException {
        boolean hasVowel = false;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }
        if (!hasVowel) {
            throw new RuntimeException("The string does not contain any vowels");
        } else {
            System.out.println("The string contains vowels");
        }
    }
}
