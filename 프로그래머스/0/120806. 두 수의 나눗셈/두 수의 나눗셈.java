class Solution {
    public int solution(int num1, int num2) {
        double divisionResult = (double) num1 / num2;
        double multipliedResult = divisionResult * 1000;
        return (int) multipliedResult;
    }
}