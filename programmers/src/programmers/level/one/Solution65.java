package programmers.level.one;

public class Solution65 {
	// 원하는 문자열 찾기
	public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }
        return answer;
    }
}