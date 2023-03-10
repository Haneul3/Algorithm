package programmers.level.one;

import java.util.Arrays;

public class Solution16 {
	public String solution(String s) {
        if(s.length() == 1){
            return s;
        }

        String[] arr = s.split("");
        Arrays.sort(arr);
        String str = "";
        for(int i=arr.length-1; i>=0; i--){
            str += arr[i];
        }
        return str;
    }
}
