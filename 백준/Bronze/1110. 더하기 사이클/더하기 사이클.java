import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        int current = start;
        int count = 0;

        do {
            int a = current / 10;
            int b = current % 10;
            current = b * 10 + (a + b) % 10;
            count++;
        } while (current != start);

        System.out.println(count);
    }
}