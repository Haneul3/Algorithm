package programmers.level.one;

public class Solution69 {
	// 점의 위치 구하기
	public int solution(int[] dot) {
        if (dot[0] > 0) return (dot[1] > 0) ? 1 : 4;
        else return (dot[1] > 0) ? 2 : 3;
    }
}