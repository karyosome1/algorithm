import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};                      // 결과를 저장할 정수 배열 초기화
        List<Integer> list = new ArrayList<>(); // divisor로 나누어 떨어지는 요소들을 담을 리스트 생성
        
        // 입력 배열 arr의 각 요소가 divisor로 나누어 떨어지면 리스트에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // divisor로 나누어 떨어지는 요소가 없어서 리스트가 비어있는 경우 -1 반환
        if (list.isEmpty()) 
            list.add(-1);
        
        // 리스트의 Integer 요소들을 int형 배열로 변환
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        // 생성된 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        return answer;
    }
}