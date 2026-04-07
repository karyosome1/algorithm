import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        while (T-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            String line;
            while (!(line = bf.readLine()).equals("0")) {
                list.add(Integer.parseInt(line));
            }

            Collections.sort(list, Collections.reverseOrder());

            long result = 0;
            boolean isTooExpensive = false;
            long limit = 5000000;

            for (int j = 0; j < list.size(); j++) {
                long cost = (long) (2 * Math.pow(list.get(j), j + 1));
                result += cost;

                if (result > limit) {
                    isTooExpensive = true;
                    break;
                }
            }

            if (isTooExpensive) {
                bw.write("Too expensive\n");
            } else {
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
