package programmers.level.one;

public class Solution9 {
	public boolean solution(int x) {
        String str = String.valueOf(x);
        
        String[] numberArr = str.split("");
        
        int sum = 0;
        
        for(String num : numberArr) {
            sum += Integer.parseInt(num);
        }
   
        return (x % sum == 0? true : false);
    }
}
