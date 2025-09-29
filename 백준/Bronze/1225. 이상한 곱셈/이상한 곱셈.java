import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        long sumA = 0;
        long sumB = 0;

        for (int i = 0; i < A.length(); i++) sumA += A.charAt(i) - '0';
        for (int i = 0; i < B.length(); i++) sumB += B.charAt(i) - '0';

        long result = sumA * sumB;
        System.out.println(result);
    }
}