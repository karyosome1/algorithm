import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            Set<Integer> setA = readToSet(sc);
            Set<Integer> setB = readToSet(sc);
            Set<Integer> setC = readToSet(sc);

            Set<Integer> resultLuckyNumbers = new HashSet<>();

            for (int a : setA) {
                for (int b : setB) {
                    for (int c : setC) {
                        int sum = a + b + c;
                        if (isLucky(sum)) {
                            resultLuckyNumbers.add(sum);
                        }
                    }
                }
            }

            System.out.println(resultLuckyNumbers.size());
        }
    }

    private static Set<Integer> readToSet(Scanner sc) {
        int size = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(sc.nextInt());
        }
        return set;
    }

    private static boolean isLucky(int num) {
        if (num <= 0) return false;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 5 && digit != 8) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}