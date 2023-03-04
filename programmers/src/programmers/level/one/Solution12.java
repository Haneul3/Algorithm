package programmers.level.one;

public class Solution12 {
	public String solution(String num) {
		String answer = "";
		for (int i = 0; i < num.length(); i++) {
			if (i < num.length() - 4) {
				answer += "*";
			} else {
				answer += num.charAt(i);
			}
		}
		return answer;
	}
}
