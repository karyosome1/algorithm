import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] map = {"D", "C", "B", "A", "E"};
        for (int i = 0; i < 3; i++) {
            int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
            System.out.println(map[sum]);
        }
    }
}
