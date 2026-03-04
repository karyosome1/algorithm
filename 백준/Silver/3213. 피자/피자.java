import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int quarter = 0;
        int half = 0;
        int threeQuarter = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.equals("1/4")) quarter++;
            else if(s.equals("1/2")) half++;
            else threeQuarter++;
        }

        int pizza = 0;

        pizza += threeQuarter;
        quarter -= Math.min(quarter, threeQuarter);

        pizza += half / 2;
        half %= 2;

        if(half == 1) {
            pizza++;
            quarter -= Math.min(quarter, 2);
        }

        if(quarter > 0) {
            pizza += (quarter + 3) / 4;
        }

        System.out.println(pizza);
    }
}