import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] students = new String[n];

        for (int i = 0; i < n; i++) {
            students[i] = br.readLine();
        }

        int l = students[0].length();

        for (int k = 1; k <= l; k++) {
            Set<String> set = new HashSet<>(n * 2);
            for (String s : students) {
                set.add(s.substring(l - k));
            }
            if (set.size() == n) {
                System.out.print(k);
                return;
            }
        }
    }
}