package programmers.level.one;

public class Solution18 {
	public long solution(int price, int money, int count) {
        long answer;
        long sum = 0;
        long result;
        for(int i=1; i<count+1; i++){
            result = i * price;
            sum += result;
        }
        if(sum - money > 0){
            answer = sum - money;
        }
        else answer = 0;
        return answer;
    }
}
