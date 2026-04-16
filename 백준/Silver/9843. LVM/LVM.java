import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] program = new String[n];

        for (int i = 0; i < n; i++) {
            program[i] = br.readLine();
        }

        Deque<Long> stack = new ArrayDeque<>();
        long register = 0;
        int pc = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(program[pc]);
            String cmd = st.nextToken();

            if (cmd.equals("PUSH")) {
                long x = Long.parseLong(st.nextToken());
                stack.push(x);
                pc++;
            } else if (cmd.equals("STORE")) {
                register = stack.pop();
                pc++;
            } else if (cmd.equals("LOAD")) {
                stack.push(register);
                pc++;
            } else if (cmd.equals("PLUS")) {
                long a = stack.pop();
                long b = stack.pop();
                stack.push(a + b);
                pc++;
            } else if (cmd.equals("TIMES")) {
                long a = stack.pop();
                long b = stack.pop();
                stack.push(a * b);
                pc++;
            } else if (cmd.equals("IFZERO")) {
                long value = stack.pop();
                int target = Integer.parseInt(st.nextToken());

                if (value == 0) {
                    pc = target;
                } else {
                    pc++;
                }
            } else if (cmd.equals("DONE")) {
                System.out.println(stack.peek());
                break;
            }
        }
    }
}
