import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean[] printed = new boolean[n + 1];
            int result = 0;

            String[] ranges = br.readLine().split(",");

            for (String range : ranges) {

                if (!range.contains("-")) {

                    int page = Integer.parseInt(range);

                    if (page <= n && !printed[page]) {
                        printed[page] = true;
                        result++;
                    }

                } else {

                    String[] nums = range.split("-");
                    int low = Integer.parseInt(nums[0]);
                    int high = Integer.parseInt(nums[1]);

                    if (low > high || low > n) continue;

                    for (int i = low; i <= Math.min(high, n); i++) {
                        if (!printed[i]) {
                            printed[i] = true;
                            result++;
                        }
                    }
                }
            }

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}