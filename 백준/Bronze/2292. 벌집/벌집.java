import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int layer = 1;
        int max = 1;

        while (n > max) {
            max += 6 * layer;
            layer++;
        }
        System.out.println(layer);
    }
}