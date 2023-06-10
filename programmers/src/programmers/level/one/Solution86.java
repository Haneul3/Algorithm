package programmers.level.one;

public class Solution86 {
	// 카드 뭉치
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;

        for (String text : goal) {
            if (cards1.length > index1 && cards1[index1].equals(text)) {
                index1++;
                continue;
            }

            if (cards2.length > index2 && cards2[index2].equals(text)) {
                index2++;
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}