import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        boolean isExploded[] = new boolean[c + 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int period = sc.nextInt();

            if (!isExploded[period]) {
                for (int t = period; t <= c; t += period) {
                    if (!isExploded[t]) {
                        isExploded[t] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
