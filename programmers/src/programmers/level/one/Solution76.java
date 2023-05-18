package programmers.level.one;

public class Solution76 {
	// 콜라츠 추측
	public int solution(int num) {
        int answer = 0;
        
        while(num > 1){
            if(answer > 500) break;
            if(num%2 == 0) num /= 2;
            else num = (num*3) + 1;
            answer++;
        }
        if(answer > 500) return -1;
        return answer;
    }
}