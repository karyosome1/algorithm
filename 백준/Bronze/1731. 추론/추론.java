import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d1 = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];

        if (d1 == d2) {
            System.out.println(arr[n - 1] + d1);
        } else {
            int r = arr[1] / arr[0];
            System.out.println(arr[n - 1] * r);
        }
    }
}
