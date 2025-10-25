import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int stamp = n;
            int extraChicken = 0;

            while (stamp >= k) {
                extraChicken += stamp / k;
                stamp = (stamp / k) + (stamp % k);
            }
            System.out.println(n + extraChicken);
        }
    }
}