import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            double num = sc.nextDouble();
            String str = sc.next();

            double out;
            String unit;

            switch (str) {
                case "kg": out = num * 2.2046; unit = "lb"; break;
                case "lb": out = num * 0.4536; unit = "kg"; break;
                case "l": out = num * 0.2642; unit = "g"; break;
                case "g": out = num * 3.7854; unit = "l"; break;
                default: throw new IllegalArgumentException("Unknown unit: " + str);
            }

            System.out.printf("%.4f %s%n", out, unit);
        }
    }
}