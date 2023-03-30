package programmers.level.one;

public class Solution33 {
	// 머쓱이보다 키 큰 사람
	public int solution(int[] array, int height) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (height < array[i]) {
				answer++;
			}
		}
		return answer;
	}

	public int solution2(int[] array, int height) {
		int answer = 0;
		for (int i : array) {
			answer += (i > height) ? 1 : 0;
		}
		return answer;
	}

	// 피자 나눠 먹기(3)
	public int solution(int slice, int n) {
		int answer = 0;
		if (n % slice == 0) {
			answer = n / slice;
		} else
			answer = n / slice + 1;
		return answer;
	}
	
	public int solution2(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
	
	public int solution3(int slice, int n) {
		int answer = n/slice;
		if(n%slice != 0) {
			answer++;
		}
		return answer;
	}
	
}