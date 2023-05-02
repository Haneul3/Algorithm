package programmers.level.one;

import java.util.Arrays;

public class Solution62 {
	// 문자열 정렬하기 - 스트림
	public int[] solution(String my_string) {
		return Arrays.stream(my_string.split("")).filter(i -> i.matches("[0-9]")).mapToInt(Integer::parseInt).sorted()
				.toArray();
	}
}