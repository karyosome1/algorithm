import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] materials = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(materials);

        int left = 0;
        int right = n - 1;
        int answer = 0;

        while (left < right) {
            int sum = materials[left] + materials[right];

            if (sum < m) {
                left++;
            } else if (sum > m) {
                right--;
            } else {
                answer++;
                left++;
                right--;
            }
        }
        System.out.println(answer);
    }
}