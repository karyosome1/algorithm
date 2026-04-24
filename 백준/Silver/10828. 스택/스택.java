import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.startsWith("push")) {
                stack.push(Integer.parseInt(input.substring(5)));
            } else if (input.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop())
                  .append('\n');
            } else if (input.equals("size")) {
                sb.append(stack.size())
                  .append('\n');
            } else if (input.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0)
                  .append('\n');
            } else if (input.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek())
                  .append('\n');
            }
        }

        System.out.print(sb);
    }
}