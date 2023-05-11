package programmers.level.one;

public class Solution70 {
	// 주사위의 개수
	 public int solution(int[] box, int n) {
	        return  (box[0] / n) * (box[1] / n) * (box[2] / n); 
	    }
}