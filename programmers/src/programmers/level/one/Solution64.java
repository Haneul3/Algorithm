package programmers.level.one;

public class Solution64 {
	// 가위 바위 보
	public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.split("")[i].equals("0")){
                answer += "5";
            }
            else if(rsp.split("")[i].equals("2")){
                answer += "0";
            }
            else answer += "2";
        }
        return answer;
    }
}