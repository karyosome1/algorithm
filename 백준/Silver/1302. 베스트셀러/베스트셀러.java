import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String title = br.readLine();
            countMap.put(title, countMap.getOrDefault(title, 0) + 1);
        }

        String best = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String title = entry.getKey();
            int cnt = entry.getValue();

            if (cnt > max || (cnt == max && title.compareTo(best) < 0)) {
                max = cnt;
                best = title;
            }
        }

        System.out.println(best);
    }
}
