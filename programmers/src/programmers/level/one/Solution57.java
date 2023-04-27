package programmers.level.one;

import java.util.Arrays;

public class Solution57 {
	// 삼각형의 완성조건(1)
	public int solution(int[] sides) {
		int answer = 0;
		Arrays.sort(sides);

		if (sides[2] < (sides[0] + sides[1])) {
			answer = 1;
		} else {
			answer = 2;
		}

		return answer;
	}
}