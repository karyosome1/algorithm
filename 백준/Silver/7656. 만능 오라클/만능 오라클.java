import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        if (s != null && !s.isEmpty()) {
            int start = 0;
            int end = -1;

            while ((start = s.indexOf("What", end + 1)) != -1) {
                end = s.indexOf("?", start + 1);

                if (end == -1) break;

                String sub = s.substring(start, end);

                if (sub.indexOf(".") != -1) {
                    end = s.indexOf(".", start + 1);
                    continue;
                }

                bw.write("Forty-two" + s.substring(start + 4, end) + ".");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
