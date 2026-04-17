import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int P = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < P; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testNum = Integer.parseInt(st.nextToken());

            int[] arr = new int[12];
            for (int i = 0; i < 12; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;

            for (int left = 1; left <= 10; left++) {
                for (int right = left; right <= 10; right++) {
                    boolean ok = true;
                    int before = arr[left - 1];
                    int after = arr[right + 1];

                    for (int i = left; i <= right; i++) {
                        if (arr[i] <= before || arr[i] <= after) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) answer++;
                }
            }

            sb.append(testNum).append(' ').append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
