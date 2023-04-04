package programmers.level.one;

public class Solution36 {
	// 특정 문자 제거하기
	public String solution(String my_string, String letter) {
        String answer = "";
        answer=my_string.replaceAll(letter, "");
        return answer;
        
        // replaceAll 사용 법 숙지
    }
}