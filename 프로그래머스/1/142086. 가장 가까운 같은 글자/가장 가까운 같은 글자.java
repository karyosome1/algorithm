class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            int closestIndex = -1; // 가장 가까운 동일 문자 인덱스 초기화
            
            // 현재 문자 이전의 문자들을 역순으로 탐색
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    closestIndex = i - j; // 거리 계산
                    break; // 가장 가까운 문자를 찾았으므로 내부 루프 종료
                }
            }
            answer[i] = closestIndex; // 결과 배열에 기록
        }
        return answer;
    }
}