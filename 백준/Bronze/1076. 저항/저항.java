import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("black", 0);
        valueMap.put("brown", 1);
        valueMap.put("red", 2);
        valueMap.put("orange", 3);
        valueMap.put("yellow", 4);
        valueMap.put("green", 5);
        valueMap.put("blue", 6);
        valueMap.put("violet", 7);
        valueMap.put("grey", 8);
        valueMap.put("white", 9);

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        long result = valueMap.get(color1) * 10L + valueMap.get(color2);

        int zeroCount = valueMap.get(color3);
        long multiplier = 1L;
        for (int i = 0; i < zeroCount; i++) {
            multiplier *= 10L;
        }

        result *= multiplier;
        System.out.print(result);
    }
}