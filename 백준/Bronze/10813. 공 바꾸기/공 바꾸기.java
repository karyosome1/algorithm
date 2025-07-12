import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] baskets = new int[n]; // 0번부터 n-1번까지 사용
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1; // 바구니에 공 번호 초기화
        }

        for (int t = 0; t < m; t++) {
            st =new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1; // 인덱스 0부터 쓰기 위해 -1
            int j = Integer.parseInt(st.nextToken()) - 1;

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int ball : baskets) {
            sb.append(ball).append(" ");
        }
        System.out.println(sb);
    }
}