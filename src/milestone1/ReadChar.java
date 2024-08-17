package milestone1;

import java.util.Scanner;

public class ReadChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println(c + " is an alphabet.");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a digit.");
        } else {
            System.out.println(c + " is a special character.");
        }
    }
}
