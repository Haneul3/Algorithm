package programmers.level.one;

public class Solution2_1 {
	public int solution2(int n) {
		int answer = 0;
		
		while (n > 0) {
			answer += n % 10; // 일의 자리부터 자릿수 더하기
			n /= 10;
		}
		return answer;
	}
}
