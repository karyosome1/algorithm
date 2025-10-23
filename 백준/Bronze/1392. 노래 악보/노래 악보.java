import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            for (int k = 0; k < t; k++)
                list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int qi = 0; qi < q; qi++) {
            int ti = sc.nextInt();
            sb.append(list.get(ti)).append('\n');
        }
        System.out.print(sb);
    }
}