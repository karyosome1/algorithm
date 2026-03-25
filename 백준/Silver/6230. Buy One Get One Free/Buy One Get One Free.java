import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = readInt(), m = readInt();
        int[] a = new int[n], b = new int[m];
        while (n-- > 0) a[n] = readInt();
        while (m-- > 0) b[m] = readInt();

        Arrays.sort(a);
        Arrays.sort(b);

        n = a.length - 1;
        m = b.length - 1;
        while (n >= 0 && m >= 0) if (a[n] > b[m--]) n--;

        bw.write(String.valueOf(a.length * 2 - ++n));
        bw.flush();
    }

    private static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }
}