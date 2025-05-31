import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        
        for (int num : win_nums) {
            winSet.add(num);
        }
        int match = 0;
        int unknown = 0;
        
        for (int num : lottos) {
            if (num == 0) {
                unknown++;
            } else if (winSet.contains(num)) {
                match++;
            }
        }
        int maxMatch = match + unknown; 
        int minMatch = match;
        
        return new int[] {getRank(maxMatch), getRank(minMatch)};
    }
    
    private int getRank(int matchCount) {
        return switch(matchCount) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}