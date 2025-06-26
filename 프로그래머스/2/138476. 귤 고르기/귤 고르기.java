import java.util.*;

class Solution{
    public int solution(int k, int[] tangerine) {
        // Step 1: 크기별로 개수 세기
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }

        // Step 2: 개수 기준으로 내림차순 정렬
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());
        
        // Step 3: k개를 채울 때까지 크기 종류 수 세기
        int sum = 0;
        int typeCount = 0;
        for (int c : counts) {
            sum += c;
            typeCount++;
            if (sum >= k) break;
        }
        
        return typeCount;
    }
}