import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] occupied = new boolean[101];
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int seat = Integer.parseInt(st.nextToken());
            if (!occupied[seat]) {
                occupied[seat] = true;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}