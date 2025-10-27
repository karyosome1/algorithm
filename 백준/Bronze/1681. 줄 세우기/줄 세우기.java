import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int l = in.nextInt();

        int count = 0;
        int i;

        for (i = 1; ; i++) {
            boolean notWant = false;

            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == l) {
                    notWant = true;
                    break;
                }
            }

            if (!notWant) count++;
            if (count == n) break;
        }
        System.out.println(i);
    }
}