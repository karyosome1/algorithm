import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Person youngest = null;
        Person oldest = null;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            Person cur = new Person(input);

            if (youngest == null || cur.isAfter(youngest)) {
                youngest = cur;
            }

            if (oldest == null || cur.isBefore(oldest)) {
                oldest = cur;
            }
        }

        System.out.println(youngest.name);
        System.out.println(oldest.name);
    }

    static class Person {
        String name;
        int dd, mm, yy;

        Person(String[] input) {
            name = input[0];
            dd = Integer.parseInt(input[1]);
            mm = Integer.parseInt(input[2]);
            yy = Integer.parseInt(input[3]);
        }

        boolean isAfter(Person other) {
            if (yy != other.yy) return yy > other.yy;
            if (mm != other.mm) return mm > other.mm;
            return dd > other.dd;
        }

        boolean isBefore(Person other) {
            if (yy != other.yy) return yy < other.yy;
            if (mm != other.mm) return mm < other.mm;
            return dd < other.dd;
        }
    }
}