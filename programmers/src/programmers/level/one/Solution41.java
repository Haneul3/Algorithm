package programmers.level.one;

public class Solution41 {
	// 문자열 안에 문자열
	public int solution(String str1, String str2) {
		int answer = 0;

		if (str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 2;
		}

		return answer;
	}

	// other
	public int solution2(String str1, String str2) {
		return (str1.contains(str2) ? 1 : 2);
	}

	// 모음 제거
	public String solution(String my_string) {
		String answer = "";
		String[] arr = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < arr.length; i++) {
			if (my_string.contains(arr[i])) {
				answer = my_string.replaceAll(arr[i], "");
				my_string = answer;
			} else {
				answer = my_string;
			}
		}

		return answer;
	}
}