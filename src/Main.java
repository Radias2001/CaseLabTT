import java.io.IOException;
import java.util.Scanner;
/*
Task #1

SELECT surname
FROM table
WHERE experience = (SELECT MAX (experience)
FROM table
WHERE experience < (SELECT MAX (experience) FROM table))
LIMIT 1;
 */

public class Main {
    public static void Task2() throws IOException {

        int a, b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter B: ");
        b = Integer.parseInt(scanner.nextLine());

        a += b;
        b = a - b;
        a -= b;

        System.out.printf("\nAfter switch: \n");
        System.out.printf("А = %s\n", a);
        System.out.printf("B = %s\n", b);
    }

    public static boolean Task3(String s) throws IOException {

        char[] charArray = s.toCharArray();
        for(int i=0; i < charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        String ans = new String(charArray);

        if (ans.toLowerCase().equals(s.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Task2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: \n");
        boolean T3 = Task3(scanner.nextLine());
        System.out.printf(String.valueOf(T3));
    }
}
