import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static int[] arr;
    static boolean[] visit;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        arr = new int[N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        back(0, "");

        System.out.println(set.size());
    }

    static void back(int depth, String current) {

        if (depth == K) {
            set.add(current);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                back(depth + 1, current + arr[i]);
                visit[i] = false;
            }
        }
    }
}