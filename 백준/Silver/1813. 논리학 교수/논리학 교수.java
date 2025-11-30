import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num <= n) {
                arr[num]++;
            }
        }

        int answer = -1;
        for (int i = n; i >= 0; i--) {
            if (arr[i] == i) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}