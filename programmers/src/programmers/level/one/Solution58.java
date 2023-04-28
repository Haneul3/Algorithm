package programmers.level.one;

public class Solution58 {
	// 옷가게 할인 받기
	public int solution(int price) {
        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000) {
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
}