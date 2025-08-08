import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [][] ch = new char[5][15];
        int[] lengths = new int[5];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            lengths[i] = str.length();

            for (int j = 0; j < lengths[i]; j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lengths[j]) {
                    sb.append(ch[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}
