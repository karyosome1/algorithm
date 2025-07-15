import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = 0;
        double[] raw = new double[n];

        for (int i = 0; i < n; i++) {
            raw[i] = Double.parseDouble(st.nextToken());
            if (raw[i] > max) max = raw[i];
        }

        double sum = 0;
        for (double score : raw) {
            sum += (score / max) * 100;
        }

        System.out.println(sum / n);
    }
}