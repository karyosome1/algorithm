class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int common = arr1[0].length;               // arr2.length와 동일
        int cols = arr2[0].length;
        
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {           // arr1의 행
            for (int j = 0; j < cols; j++) {       // arr2의 열
                int sum = 0;
                for (int k = 0; k < common; k++) { // arr1의 열 = arr2의 행
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}