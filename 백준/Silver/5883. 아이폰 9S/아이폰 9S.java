import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            set.add(arr[i]);
        }

        int answer = 0;

        for(int removed : set){
            int count = 0;
            int prev = Integer.MIN_VALUE;

            for(int j = 0 ; j < N ; j++){
                if(arr[j] == removed) continue;

                if(arr[j] == prev){
                    count++;
                }else{
                    answer = Math.max(answer, count);
                    prev = arr[j];
                    count = 1;
                }
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}
