import java.util.*;

public class Main {
    public static String solution(String str) {
        str = str.replace("XXXX", "AAAA");
        str = str.replace("XX", "BB");

        if (str.contains("X")) {
            return "-1";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
        sc.close();
    }
}