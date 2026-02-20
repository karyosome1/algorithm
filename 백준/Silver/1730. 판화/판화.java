import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String command = br.readLine();

        map = new char[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(map[i], '.');
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);

            int nx = x;
            int ny = y;

            if(c == 'U') nx--;
            else if(c == 'D') nx++;
            else if(c == 'L') ny--;
            else if(c == 'R') ny++;

            if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

            update(x, y, c);
            update(nx, ny, c);

            x = nx;
            y = ny;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

    static void update(int x, int y, char dir) {
        if(dir == 'U' || dir == 'D') {
            if(map[x][y] == '-') map[x][y] = '+';
            else if(map[x][y] == '.') map[x][y] = '|';
        } else {
            if(map[x][y] == '|') map[x][y] = '+';
            else if(map[x][y] == '.') map[x][y] = '-';
        }
    }
}
