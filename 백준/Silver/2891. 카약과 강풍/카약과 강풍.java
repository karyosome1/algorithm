import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[] team = new int[N];
        Arrays.fill(team, 1);

        if (S > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < S; i++) {
                int idx = Integer.parseInt(st.nextToken()) - 1;
                team[idx]--;
            }
        }

        if (R > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < R; i++) {
                int idx = Integer.parseInt(st.nextToken()) - 1;
                team[idx]++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (team[i] == 0) {

                if (i > 0 && team[i - 1] == 2) {
                    team[i]++;
                    team[i - 1]--;
                }
                else if (i < N - 1 && team[i + 1] == 2) {
                    team[i]++;
                    team[i + 1]--;
                }
            }
        }

        int result = 0;
        for (int t : team) {
            if (t == 0) result++;
        }

        System.out.println(result);
    }
}