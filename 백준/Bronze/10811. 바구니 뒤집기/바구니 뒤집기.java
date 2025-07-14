import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 역순으로 바꿀 횟수

        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1; // 초기 바구니 번호는 1~N
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1; // 시작 인덱스(0-based)
            int end = Integer.parseInt(st.nextToken()) - 1;   // 끝 인덱스(0-based)

            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;
                start++;
                end--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int num : baskets) {
            result.append(num).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}