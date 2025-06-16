import java.util.Map;

class Solution {
    
    private int[] currentPosition = new int[2]; // 현재 위치 (row, col)
    
    private static final Map<Character, int[]> DIRECTION_MAP = Map.of(
        'N', new int[] {-1, 0},
        'S', new int[] {1, 0},
        'W', new int[] {0, -1},
        'E', new int[] {0, 1}
    );
    public int[] solution(String[] park, String[] movementRoutes) {
        findStartPosition(park);
        
        for (String route : movementRoutes) {
            char direction = route.charAt(0); // 'N', 'S', 'E', 'W'
            int distance = Character.getNumericValue(route.charAt(2));
            
            int[] deltas = DIRECTION_MAP.get(direction);
            int deltaRow = deltas[0];
            int deltaCol = deltas[1];
            
            tryToMove(park, distance, deltaRow, deltaCol);
        }
        return currentPosition;
    }
    
    private void findStartPosition(String[] park) {
        for (int row = 0; row < park.length; row++) {
            for (int col = 0; col < park[row].length(); col++) {
                if (park[row].charAt(col) == 'S') {
                    currentPosition[0] = row;
                    currentPosition[1] = col;
                    return;
                }
            }
        }
    }
    
    private void tryToMove(String[] park, int distance, int deltaRow, int deltaCol) {
        int nextRow = currentPosition[0];
        int nextCol = currentPosition[1];
        
        for (int step = 1; step <= distance; step++) {
            int tempRow = nextRow + deltaRow;
            int tempCol = nextCol + deltaCol;
            
            if (tempRow < 0 || tempRow >= park.length || tempCol < 0 || tempCol >= park[0].length()) {
                return;
            }
            
            if (park[tempRow].charAt(tempCol) == 'X') {
                return;
            }
            
            nextRow = tempRow;
            nextCol = tempCol;
        }
        
        currentPosition[0] = nextRow;
        currentPosition[1] = nextCol;
    }
}