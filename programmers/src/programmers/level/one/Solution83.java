package programmers.level.one;

import java.util.ArrayList;
import java.util.Collections;

public class Solution83 {
	// 명예의 전당(1)
	class Solution {
	    public int[] solution(int k, int[] score) {
	        int[] answer = new int[score.length];
	        ArrayList<Integer> honor = new ArrayList<Integer>();
	        int idx = Math.min(k, score.length);
	        
	        for(int i=0; i<idx; i++) {
	            honor.add(score[i]);
	            Collections.sort(honor);
	            answer[i] = honor.get(0);
	        }
	        
	        for(int i=k; i<score.length; i++) {
	            honor.add(score[i]);
	            Collections.sort(honor, Collections.reverseOrder());
	            answer[i] = honor.get(k-1); 
	        }
	        return answer;
	    }
	}

}