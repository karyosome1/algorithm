import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int scenario = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            sc.nextLine();

            String[] names = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                names[i] = sc.nextLine();
            }

            int[] cnt = new int[n + 1];

            for (int i = 0; i < 2 * n - 1; i++) {
                int num = sc.nextInt();
                String s = sc.next();
                cnt[num]++;
            }

            int missing = -1;
            for (int i = 1; i <= n; i++) {
                if (cnt[i] == 1) {
                    missing = i;
                    break;
                }
            }

            scenario++;
            System.out.println(scenario + " " + names[missing]);
        }
    }
}