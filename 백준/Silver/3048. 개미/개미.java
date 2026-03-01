import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String group1 = sc.next();
        String group2 = sc.next();

        int T = sc.nextInt();
        List<Ant> list = new ArrayList<>();

        for (int i = group1.length() - 1; i >= 0; i--) {
            list.add(new Ant(group1.charAt(i), 1));
        }

        for (int i = 0; i < group2.length(); i++) {
            list.add(new Ant(group2.charAt(i), 2));
        }

        while (T-- > 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                Ant current = list.get(i);
                Ant next = list.get(i + 1);

                if (current.num == 1 && next.num == 2) {
                    list.set(i, next);
                    list.set(i + 1, current);
                    i++;
                }
            }
        }

        for (Ant ant : list) {
            System.out.print(ant.ch);
        }
    }

    static class Ant {
        char ch;
        int num;

        Ant(char ch, int num) {
            this.ch = ch;
            this.num = num;
        }
    }
}