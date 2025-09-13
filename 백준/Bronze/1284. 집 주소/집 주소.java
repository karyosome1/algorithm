import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            if (line.equals("0")) break;

            int n = line.length();
            int length = 1 + n;

            for (int i = 0; i < n; i++) {
                length += digitWidth(line.charAt(i));
            }

            System.out.println(length);
        }
    }

    private static int digitWidth(char ch) {
        if (ch == '1') return 2;
        if (ch == '0') return 4;
        return 3;
    }
}