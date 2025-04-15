class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];        // answer 배열 초기화 (기본값 OL, 크기 n)
        for (int i = 0; i < n; i++) {       // 배열 인덱스 0부터 n-1까지 순회
            answer[i] = (long) x * (i + 1); // 배열의 i번째 요소에 x에 (i + 1)을 곱한 값을 저장 
                                            // (long)으로 형변환하여 잠재적인 오버플로우를 방지
        }
        return answer;
    }
}