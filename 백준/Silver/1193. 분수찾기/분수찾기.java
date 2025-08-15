import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());

        int n = 0, sum = 0;
        while (sum < x) {
            n++;
            sum += n;
        }

        int prevTri = sum - n;
        int offset = x - prevTri;

        int top, bot;
        if ((n & 1) == 0) {
            top = offset;
            bot = n - offset + 1;
        } else {
            top = n - offset + 1;
            bot = offset;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(top).append('/').append(bot);
        System.out.println(sb);
    }
}
