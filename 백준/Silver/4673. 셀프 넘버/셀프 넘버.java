import java.io.*;

public class Main {
    static final int LIMIT = 10000;
    static boolean[] generated = new boolean[10036];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= LIMIT; i++) {
            if (!generated[i]) {
                bw.write(i + "\n");
            }
            markGenerated(i);
        }

        bw.flush();
        bw.close();
    }

    static void markGenerated(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        generated[sum] = true;
    }
}