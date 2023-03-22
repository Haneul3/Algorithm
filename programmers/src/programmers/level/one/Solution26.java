package programmers.level.one;

public class Solution26 {
	public long solution(String my_string) {
        int sum = 0;
        // 문자없애고 구분하기
        String[] arr = my_string.replaceAll("[a-zA-z]","").split("");
        // 문제에서 문자열의 길이에 대한 조건이 제시되어 있음
        for(int i = 0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}