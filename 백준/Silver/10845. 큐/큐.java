import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    q.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    Integer x = q.poll();
                    sb.append(x == null ? -1 : x).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peekFirst()).append("\n");
                    break;

                case "back":
                    sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}