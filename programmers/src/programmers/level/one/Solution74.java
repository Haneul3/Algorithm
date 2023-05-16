package programmers.level.one;

public class Solution74 {
	// 모음 제거
	public String solution(String my_string) {
	      String answer="";
	      answer = my_string.replaceAll("[aeiou]", "");   //매개변수로 주어진 my_string에 [aeiou] 모음이 포함되면 제거
	        return answer;
	    }
}