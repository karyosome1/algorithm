import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] trophy = new int[n];

        for (int i = 0; i < n; i++) {
            trophy[i] = sc.nextInt();
        }

        int left = 0;
        int leftPrev = 0;
        for (int i = 0; i < n; i++) {
            if (trophy[i] > leftPrev) {
                left++;
                leftPrev = trophy[i];
            }
        }

        int right = 0;
        int rightPrev = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (trophy[i] > rightPrev) {
                right++;
                rightPrev = trophy[i];
            }
        }
        System.out.println(left);
        System.out.println(right);
    }
}