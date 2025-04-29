import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        
        // 빈 배열인 경우 -1 채우고 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최솟값 구하기
        int min = Arrays.stream(arr).min().getAsInt();

        // 최솟값을 제거한 배열 반환
        return Arrays.stream(arr)
                .filter(num -> num != min)
                .toArray();
    }
}