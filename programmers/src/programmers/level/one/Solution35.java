package programmers.level.one;

public class Solution35 {
	// 치킨 쿠폰
	 public int solution(int chicken) {
	        int answer = 0;
	        int coupon = 0;
	        while(true) {
	            coupon = chicken / 10;
	            chicken = chicken % 10 + coupon;
	            answer += coupon;
	            if(chicken < 10) {
	                break;
	            }
	        }
	        return answer;
	    }
}