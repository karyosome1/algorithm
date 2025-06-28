import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> sumSet = new HashSet<>();
        
        // elements를 2배로 확장하여 원형 수열처럼 만들기
        int[] extended = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            extended[i] = elements[i % n];
        }
        
        // 부분 수열 길이를 1부터 n까지 반복
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = start; k < start + len; k++) {
                    sum += extended[k];
                }
                sumSet.add(sum);
            }
        }
        return sumSet.size();
    }
}