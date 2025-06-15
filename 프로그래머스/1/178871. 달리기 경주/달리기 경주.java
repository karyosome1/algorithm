import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }
        
        for (String calledPlayer : callings) {
            int currentIndex = playerIndexMap.get(calledPlayer);
            int newIndex = currentIndex - 1;
            
            String swappedPlayer = players[newIndex];
            
            players[currentIndex] = swappedPlayer;
            players[newIndex] =calledPlayer;
            
            playerIndexMap.put(calledPlayer, newIndex);
            playerIndexMap.put(swappedPlayer, currentIndex);
        }
        return players;
    }
}