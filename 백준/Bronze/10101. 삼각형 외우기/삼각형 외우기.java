import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(br.readLine().trim());
        }

        int sum = a[0] + a[1] + a[2];
        String ans;

        if (a[0] == 60 && a[1] == 60 && a[2] == 60) {
            ans = "Equilateral";
        } else if (sum == 180) {
            if (a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) {
                ans = "Isosceles";
            } else {
                ans = "Scalene";
            }
        } else {
            ans = "Error";
        }

        System.out.println(ans);
    }
}