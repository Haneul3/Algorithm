package programmers.level.one;

public class Solution21 {
    public int Solution(int a, int b){
        if(a % b == 0) return b;
        return Solution(b, a%b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max, min;
        
        if(n >= m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        
        answer[0] = Solution(max, min);
        answer[1] = max*min/answer[0];
        
        return answer;
    }
}
