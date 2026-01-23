import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] a = new int[A];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> bSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        int[] result = new int[A];
        int size = 0;
        for (int i = 0; i < A; i++) {
            if (!bSet.contains(a[i])) {
                result[size++] = a[i];
            }
        }

        if (size == 0) {
            System.out.print("0");
            return;
        }

        Arrays.sort(result, 0, size);

        StringBuilder sb = new StringBuilder();
        sb.append(size).append('\n');
        sb.append(result[0]);
        for (int i = 1; i < size; i++) {
            sb.append(' ').append(result[i]);
        }

        System.out.print(sb);
    }
}