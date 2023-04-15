package programmers.level.one;

import java.util.Arrays;

public class Solution46 {
	// 가까운 수
	public int solution(int[] array, int n) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= n) {
				int Lvalue = n - array[(i - 1)];
				int Rvalue = array[i] - n;
				return Lvalue <= Rvalue ? array[(i - 1)] : array[i];
			}
		}
		return array[array.length - 1];
	}
}