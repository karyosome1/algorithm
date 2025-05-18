import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>(); 
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                sumSet.add(sum); 
            }
        }
        
        List<Integer> sumList = new ArrayList<>(sumSet);
        Collections.sort(sumList);
        
        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        return answer;
    }
}