import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, HashSet<Integer>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                int idx = line.lastIndexOf(' ');
                String name = line.substring(0, idx);
                int year = Integer.parseInt(line.substring(idx + 1));

                map.computeIfAbsent(name, k -> new HashSet<>()).add(year);
            }

            ArrayList<String> eligible = new ArrayList<>();
            for (String name : map.keySet()) {
                if (map.get(name).size() < 5) {
                    eligible.add(name);
                }
            }

            Collections.sort(eligible);

            bw.write("Case #" + tc + ":\n");
            for (String name : eligible) {
                bw.write(name);
                bw.write('\n');
            }
        }

        bw.flush();
    }
}