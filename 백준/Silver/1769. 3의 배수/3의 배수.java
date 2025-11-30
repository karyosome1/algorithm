import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int count = 0;

        while (n.length() > 1) {
            int sum = 0;

            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';
            }

            count++;
            n = Integer.toString(sum);
        }
        System.out.println(count);

        int lastDigit = n.charAt(0) - '0';
        if (lastDigit % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}