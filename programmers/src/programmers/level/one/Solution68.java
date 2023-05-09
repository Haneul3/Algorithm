package programmers.level.one;

public class Solution68 {
	// 피자 나눠 먹기(2)
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= 6 * n; i++) {
			if (6 * i % n == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}