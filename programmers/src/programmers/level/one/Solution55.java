package programmers.level.one;

import java.util.Arrays;

public class Solution55 {
	// 중앙값 구하기
	public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}