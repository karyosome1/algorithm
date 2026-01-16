import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] names = new String[n + 1];
        Map<String, Integer> nameToIndex = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            names[i] = pokemon;
            nameToIndex.put(pokemon, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char c = s.charAt(0);

            if ('0' <= c && c <= '9') {
                sb.append(names[Integer.parseInt(s)]);
            } else {
                sb.append(nameToIndex.get(s));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}