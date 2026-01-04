import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int result = a.length();

        for (int i = 0; i <= b.length() - a.length(); i++) {
            int diff = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    diff++;
                    if (diff >= result) {
                        break;
                    }
                }
            }

            result = Math.min(result, diff);
        }

        System.out.println(result);
    }
}