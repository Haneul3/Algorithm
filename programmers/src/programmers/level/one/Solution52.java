package programmers.level.one;

public class Solution52 {
	// 피자 나눠 먹기(1)
	public int solution(int n) {
		int answer = 0;
		return answer = (n % 7 == 0) ? n / 7 : n / 7 + 1;
	}
}