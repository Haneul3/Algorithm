package programmers.level.one;

public class Solution31 {
	// 두 수의 나눗셈 - 형변환체크
	public int solution1(int num1, int num2) {
        double answer = (double)num1/num2*1000;        
        return (int)answer;
    }
	
	// 짝수의 합
	public int solution2(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                answer += i;
            }
        }
        return answer;
    }
	
	// 배열의 평균값
	public double solution3(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
	
	// 양꼬치
	public int solution(int n, int k) {
        int eat = n*12000;
        int drink = k*2000;
        int answer = eat + drink;
        if(eat >= 120000){
          for(int i=0; i<n/10; i++){
              answer -= 2000;
          }  
        }
        return answer;
    }
	
	public int solution4(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}