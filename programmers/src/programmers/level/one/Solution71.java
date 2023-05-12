package programmers.level.one;

public class Solution71 {
	// 숫자 찾기
	public int solution(int num, int k) {
		String numberS = Integer.toString(num);
		String result = Integer.toString(k);
		if(numberS.indexOf(result) == -1) {
			return -1;
		}else {
			return numberS.indexOf(result)+1; 
		}
	}
	
	
	public int solution2(int num, int k) {
	    return ("-" + num).indexOf(String.valueOf(k));
	}
}