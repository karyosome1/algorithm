import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        BigInteger n = new BigInteger(s, 8);
        System.out.println(n.toString(2));
    }
}
