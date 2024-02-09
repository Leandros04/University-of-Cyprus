public class Other1 {
    public static void letters(char ch) {
        for (char letter = 'a'; letter <= ch; letter++) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        letters('a'); // Output: a
        letters('d'); // Output: abcd
    }
}
