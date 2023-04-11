package programmers.level.one;

public class Solution42 {
	// 숨어있는 숫자의 덧셈 (2)
	public int solution(String my_string) {
		int answer = 0;
		String[] ms = my_string.split("[a-zA-Z]");
		for (int i = 0; i < ms.length; i++) {
			answer += !ms[i].isEmpty() ? Integer.parseInt(ms[i]) : 0;
		}
		return answer;
	}
}