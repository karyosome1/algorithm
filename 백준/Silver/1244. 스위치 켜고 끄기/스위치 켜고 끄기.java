import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] switchValue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        switchValue = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            switchValue[i] = Integer.parseInt(st.nextToken());
        }

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                manToggle(num);
            } else {
                womanToggle(num);
            }
        }

        for (int i = 1; i <= N; i++) {
            if (i > 1) {
                if ((i - 1) % 20 == 0) bw.newLine();
                else bw.write(' ');
            }
            bw.write(String.valueOf(switchValue[i]));
        }

        bw.flush();
    }

    static void manToggle(int num) {
        for (int i = num; i <= N; i += num) {
            switchValue[i] ^= 1;
        }
    }

    static void womanToggle(int num) {
        int start = num - 1;
        int end = num + 1;

        while (start >= 1 && end <= N && switchValue[start] == switchValue[end]) {
            start--;
            end++;
        }

        start++;
        end--;

        for (int i = start; i <= end; i++) {
            switchValue[i] ^= 1;
        }
    }
}