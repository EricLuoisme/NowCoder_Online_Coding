import java.util.Scanner;

public class TEST {
    public static int counting(String text, char chaR) {

        int count = 0;
        chaR = Character.toLowerCase(chaR);
        if (text != null && text.length() > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (Character.toLowerCase(text.charAt(i)) == chaR) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char chaR = in.next().charAt(0);
        int result = counting(text, chaR);
        System.out.println(result);
    }
}
