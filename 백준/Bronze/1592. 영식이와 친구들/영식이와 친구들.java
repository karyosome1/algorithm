import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[] receiveCount = new int[n + 1];
        int current = 1;
        int throwCount = 0;

        while (true) {
            receiveCount[current]++;

            if (receiveCount[current] == m) {
                break;
            }

            if (receiveCount[current] % 2 == 1) {
                current += l;
                if (current > n) current -= n;
            } else {
                current -= l;
                if (current <= 0) current += n;
            }
            throwCount++;
        }
        System.out.println(throwCount);
    }
}