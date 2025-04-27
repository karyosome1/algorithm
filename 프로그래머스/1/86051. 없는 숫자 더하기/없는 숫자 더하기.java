class Solution {
    public int solution(int[] numbers) {
        int answer = 45; 
        
        // 0부터 9까지 합에서 배열에 존재하는 숫자 빼기
        for (int num : numbers) {
            answer -= num; 
        }
        return answer;
    }
}