package programmers.level.one;

public class Solution63 {
	// 인덱스 바꾸기

	public String solution(String my_string, int num1, int num2) {
		String answer = "";
		String[] arr = my_string.split("");

		String tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;

		answer = String.join("", arr);

		return answer;
	}
}