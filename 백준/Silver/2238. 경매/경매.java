import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] price = new int[n];
        int[] count = new int[u + 1];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            price[i] = sc.nextInt();
            count[price[i]]++;
        }

        int minCount = Integer.MAX_VALUE;
        int minPrice = -1;

        for (int p = 1; p <= u; p++) {
            if (count[p] > 0 && count[p] < minCount) {
                minCount = count[p];
                minPrice = p;
            }
        }

        for (int i = 0; i < n; i++) {
            if (price[i] == minPrice) {
                System.out.println(name[i] + " " + price[i]);
                break;
            }
        }
    }
}