import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int d1 = num2 % 10;
        int d2 = (num2 / 10) % 10;
        int d3 = num2 / 100;

        System.out.println(num1 * d1);
        System.out.println(num1 * d2);
        System.out.println(num1 * d3);
        System.out.println(num1 * num2);
    }
}