import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long answer = 0;
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 2; i >= 0; i--) {
            if (num[i] >= num[i + 1]) {
                int target = num[i + 1] - 1;
                answer += num[i] - target;
                num[i] = target;
            }
        }

        System.out.println(answer);
    }
}