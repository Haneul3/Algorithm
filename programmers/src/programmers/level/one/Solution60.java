package programmers.level.one;

public class Solution60 {
	// 조건에 맞게 수열 변환하기 3
	public int[] solution(int[] arr, int k) {
        if(k%2==0){
            for(int i=0; i<arr.length;i++){
                arr[i] += k;   
            }
        }
        else{
            for(int i=0; i<arr.length;i++){
                arr[i] *= k;   
            }
        }
        return arr;
    }
}