import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        // 0부터 a 배열의 길이까지의 정수 스트림 생성
        return IntStream.range(0, a.length)
                        // 같은 인덱스의 원소끼리 곱셈 결과를 담은 새로운 스트림 생성
                        .map(i -> a[i] * b[i])
                        // 스트림의 모든 요소(각 원소의 곱)를 더하여 내적 값 계산
                        .sum();
    }
}