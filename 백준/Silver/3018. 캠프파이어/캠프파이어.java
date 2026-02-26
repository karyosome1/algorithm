import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        List<List<Integer>> knowSongs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            knowSongs.add(new ArrayList<>());
        }

        int songCnt = 0;

        for (int day = 0; day < e; day++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> participant = new ArrayList<>();
            boolean isSeonYeong = false;

            for (int i = 0; i < k; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 1) isSeonYeong = true;
                participant.add(a);
            }

            if (isSeonYeong) {
                songCnt++;
                for (int people : participant) {
                    knowSongs.get(people).add(songCnt);
                }
            } else {
                HashSet<Integer> hs = new HashSet<>();

                for (int people : participant) {
                    for (int song : knowSongs.get(people)) {
                        hs.add(song);
                    }
                }

                for (int people : participant) {
                    knowSongs.set(people, new ArrayList<>(hs));
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (knowSongs.get(i).size() == songCnt) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}