import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> countMap = new HashMap<>();

        int totalCount = 0;
        int warningCount = 0;

        while (n-- > 0) {
            String name = br.readLine();

            int currentCount = countMap.getOrDefault(name, 0);
            int othersCount = totalCount - currentCount;

            if (currentCount > othersCount) {
                warningCount++;
            }

            countMap.put(name, currentCount + 1);
            totalCount++;
        }

        System.out.println(warningCount);
    }
}
