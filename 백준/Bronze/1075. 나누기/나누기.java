import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int base = (n / 100) * 100;
        int add = (f - (base % f)) % f;

        System.out.printf("%02d", add);
    }
}