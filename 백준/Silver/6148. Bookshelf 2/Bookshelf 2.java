import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, B;
    static int[] cowHeights;
    static int minHeightDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        B = Integer.parseInt(input[1]);

        cowHeights = new int[N];
        for (int i = 0; i < N; i++) {
            cowHeights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cowHeights);
        reverse(cowHeights);

        dfs(0, 0);

        System.out.println(minHeightDiff);
    }

    static void dfs(int idx, int sum) {
        if (sum >= B) {
            minHeightDiff = Math.min(minHeightDiff, sum - B);
            return;
        }

        if (idx == N) return;

        if (sum - B >= minHeightDiff) return;

        dfs(idx + 1, sum + cowHeights[idx]);

        dfs(idx + 1, sum);
    }

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}