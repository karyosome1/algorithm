import java.io.*;
import java.util.*;

public class Main {
    static class TeamDist {
        int team;
        int dist;
        TeamDist(int team, int dist) {
            this.team = team;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] dist = new int[10];
        Arrays.fill(dist, -1);

        for (int i = 0; i < r; i++) {
            String line = br.readLine();

            for (int j = 0; j < c; j++) {
                char ch = line.charAt(j);
                if (ch >= '1' && ch <= '9') {
                    int team = ch - '0';

                    if (j + 2 < c && line.charAt(j + 1) == ch && line.charAt(j + 2) == ch) {
                        int frontIdx = j + 2;
                        dist[team] = (c - 1) - frontIdx;
                    } else {
                        dist[team] = (c - 1) - j;
                    }
                    break;
                }
            }
        }

        TeamDist[] arr = new TeamDist[9];
        for (int team = 1; team <= 9; team++) {
            arr[team - 1] = new TeamDist(team, dist[team]);
        }

        Arrays.sort(arr, Comparator.comparing(a -> a.dist));

        int[] rankOfTeam = new int[10];
        int rank = 1;

        rankOfTeam[arr[0].team] = rank;
        for (int i = 1; i < 9; i++) {
            if (arr[i].dist != arr[i - 1].dist) {
                rank++;
            }
            rankOfTeam[arr[i].team] = rank;
        }
        for (int team = 1; team <= 9; team++) {
            System.out.println(rankOfTeam[team]);
        }
    }
}