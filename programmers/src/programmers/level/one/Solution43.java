package programmers.level.one;

public class Solution43 {
	// 암호해독
	 public String solution(String cipher, int code) {
	        String answer = "";
	        for(int i=code-1;i<cipher.length();i+=code){
	            answer+=cipher.charAt(i);
	        }
	        return answer;
	    }
}