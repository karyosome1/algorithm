import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];
        cnt[sc.nextInt() - 1]++;
        cnt[sc.nextInt() - 1]++;
        cnt[sc.nextInt() - 1]++;

        for (int i = 0; i < 6; i++) {
            if (cnt[i] == 3) {
                System.out.println(10000 + (i + 1) * 1000);
                return;
            } else if (cnt[i] == 2) {
                System.out.println(1000 + (i + 1) * 100);
                return;
            }
        }

        int max = 1;
        for (int i = 5; i >= 0; i--) {
            if (cnt[i] > 0) {
                max = i + 1;
                break;
            }
        }
        System.out.println(max * 100);
    }
}