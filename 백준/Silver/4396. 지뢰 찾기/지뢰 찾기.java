import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] mines = new char[n][n];
        char[][] result = new char[n][n];

        for (int i = 0; i < n; i++) {
            mines[i] = br.readLine().toCharArray();
        }

        boolean exploded = false;

        for (int i = 0; i < n; i++) {

            String line = br.readLine();

            for (int j = 0; j < n; j++) {

                if (line.charAt(j) == 'x') {

                    if (mines[i][j] == '*') {
                        exploded = true;
                    } else {

                        int count = 0;

                        for (int d = 0; d < 8; d++) {
                            int nx = i + dx[d];
                            int ny = j + dy[d];

                            if (nx >= 0 && nx < n && ny >= 0 && ny < n && mines[nx][ny] == '*') {
                                count++;
                            }
                        }

                        result[i][j] = (char) (count + '0');
                    }

                } else {
                    result[i][j] = '.';
                }
            }
        }
        
        if (exploded) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mines[i][j] == '*') {
                        result[i][j] = '*';
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(result[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}