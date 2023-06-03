/*
 * String is a collection of characters.
 * In Java, String is a pre-defined class
 * String is immutable. Therefore, it can’t be changed once the value is assigned to a string variable.
 */

import java.util.Scanner;
public class String {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        java.lang.String name;
        System.out.println("Enter name");
        name = S.nextLine();
        S.close();
        // char name1[] = { 'M', 'a', 'n', 'i', ' ', 'T', 'y', 'a', 'g', 'h' };

        System.out.println(name);
        // System.out.println(name1);
    }
}
