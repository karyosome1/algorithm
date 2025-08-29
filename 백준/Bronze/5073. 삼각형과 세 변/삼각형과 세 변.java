import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            sb.append(classifyTriangle(a, b, c)).append('\n');
        }
        System.out.print(sb);
    }

    private static String classifyTriangle(int a, int b, int c) {
        int[] s = {a, b, c};
        Arrays.sort(s);

        if (s[0] + s[1] <= s[2]) return "Invalid";
        if (s[0] == s[2]) return "Equilateral";
        if (s[0] == s[1] || s[1] == s[2]) return "Isosceles";
        return "Scalene";
    }
}