package programmers.level.one;

public class Solution32 {
	// 세균 증식
	public int solution1(int n, int t) {
        int answer = n;
        for(int i=0;i<t;i++){
            answer*=2;
        }
        return answer;
    }
	
	public int solution2(int n, int t) {
        return n * (int) Math.pow(2, t);  // 제곱 함수
    }
}