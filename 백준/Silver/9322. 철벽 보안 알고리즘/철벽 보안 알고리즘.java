import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            Map<String, Integer> key1Map = new HashMap<>();
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                key1Map.put(st1.nextToken(), i);
            }

            int[] mapping = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                mapping[i] = key1Map.get(st2.nextToken());
            }

            String[] encrypted = br.readLine().split(" ");
            String[] decrypted = new String[n];

            for (int i = 0; i < n; i++) {
                decrypted[mapping[i]] = encrypted[i];
            }

            for (String word : decrypted) {
                sb.append(word).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}