import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static final String[] WORD = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    private static String toKey(int num) {
        if (num < 10) return WORD[num];
        return WORD[num / 10] + " " + WORD[num % 10];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            numbers.add(i);
        }

        numbers.sort(Comparator.comparing(Main::toKey));

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int num : numbers) {
            if (cnt % 10 != 0) sb.append(' ');
            sb.append(num);
            cnt++;

            if (cnt % 10 == 0) sb.append('\n');
        }

        System.out.print(sb);
    }
}