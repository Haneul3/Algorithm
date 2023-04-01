package programmers.level.one;

import java.util.Arrays;

public class Solution34 {
	// 아이스 아메리카노
	public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
	
	public int[] solution2(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
	
	// 배열자르기 Arrays.copyOfRange 이해 필요
	class Solution {
	    public int[] solution(int[] numbers, int num1, int num2) {
	        return Arrays.copyOfRange(numbers, num1, (num2 + 1));
	    }
	}
}