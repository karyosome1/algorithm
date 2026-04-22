import java.io.*;
import java.util.*;

public class Main {
    private static final int OFFSET = 10_000_000;
    private static final int MAX_RANGE = 20_000_001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] countArray = new int[MAX_RANGE];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            countArray[Integer.parseInt(st.nextToken()) + OFFSET]++;
        }
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(stM.nextToken());
            sb.append(countArray[query + OFFSET]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
