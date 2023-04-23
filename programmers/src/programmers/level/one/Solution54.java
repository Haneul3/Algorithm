package programmers.level.one;

public class Solution54 {
	// 제곱수 판별하기
	public int solution(int n) {
        return (int)Math.sqrt(n)*(int)Math.sqrt(n) == n ? 1:2;
    }
}