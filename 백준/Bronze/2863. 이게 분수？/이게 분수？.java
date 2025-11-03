import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        arr[0] = (a / c) + (b / d);
        arr[1] = (c / d) + (a / b);
        arr[2] = (d / b) + (c / a);
        arr[3] = (b / a) + (d / c);

        double max = arr[0];
        int n = 0;

        for (int i = 1; i < 4; i++) {
            if (arr[i] > max) {
                max = arr[i];
                n = i;
            }
        }
        System.out.println(n);
    }
}