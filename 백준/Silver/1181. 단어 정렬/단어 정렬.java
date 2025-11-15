import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        Set<String> set = new HashSet<>(n);

        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        List<String> list = new ArrayList<>(set);

        Comparator<String> wordComparator = (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        };

        list.sort(wordComparator);

        for (String word : list) {
            sb.append(word).append('\n');
        }

        System.out.print(sb);
    }
}