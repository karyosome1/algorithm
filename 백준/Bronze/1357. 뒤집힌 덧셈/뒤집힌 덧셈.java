import java.io.*;
import java.util.*;

public class Main {
    private static int revToInt(String s) {
        return Integer.parseInt(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = revToInt(st.nextToken());
        int b = revToInt(st.nextToken());
        System.out.println(revToInt(String.valueOf(a + b)));
    }
}