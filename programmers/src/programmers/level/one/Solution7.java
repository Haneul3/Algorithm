package programmers.level.one;

public class Solution7 {
	
	boolean solution(String s) {
		char[] arr = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'p' || arr[i] == 'P')
				cnt++;
			else if (arr[i] == 'y' || arr[i] == 'Y')
				cnt--;
		}
		return cnt == 0;
	}
	
}
