import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> horizontalCuts = new ArrayList<>();
        List<Integer> verticalCuts = new ArrayList<>();

        horizontalCuts.add(0);
        horizontalCuts.add(height);
        verticalCuts.add(0);
        verticalCuts.add(width);

        for (int i = 0; i < n; i++) {
            int direction = sc.nextInt();
            int position = sc.nextInt();
            if (direction == 0) {
                horizontalCuts.add(position);
            } else {
                verticalCuts.add(position);
            }
        }

        Collections.sort(horizontalCuts);
        Collections.sort(verticalCuts);

        int maxHeight = getMaxInterval(horizontalCuts);
        int maxWidth = getMaxInterval(verticalCuts);

        System.out.println(maxWidth * maxHeight);
    }

    private static int getMaxInterval(List<Integer> cuts) {
        int maxInterval = 0;
        for (int i = 1; i < cuts.size(); i++) {
            int interval = cuts.get(i) - cuts.get(i - 1);
            if (interval > maxInterval) maxInterval = interval;
        }
        return maxInterval;
    }
}