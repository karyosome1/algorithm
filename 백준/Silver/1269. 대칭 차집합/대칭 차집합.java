import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aCount = Integer.parseInt(st.nextToken());
        int bCount = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCount; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        int intersection = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bCount; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (aSet.contains(x)) {
                intersection++;
            }
        }

        int answer = aCount + bCount - 2 * intersection;
        System.out.println(answer);
    }
}