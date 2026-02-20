import java.util.Scanner;

public class reversed {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to reverse: ");
        String text = sc.nextLine();

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
        sc.close();
    }
}