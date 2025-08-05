import java.io.*;
import java.util.*;

public class Main {
    private static final Map<String, Double> gradeMap = createGradeMap();

    public static void main(String[] args) throws IOException {
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) continue;

            double point = gradeMap.getOrDefault(grade, 0.0);
            totalPoints += credit * point;
            totalCredits += credit;
        }
        System.out.printf("%.6f\n", totalPoints / totalCredits);
    }

    private static Map<String, Double> createGradeMap() {
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        return map;
    }
}