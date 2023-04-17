package programmers.level.one;

public class Solution48 {
	// 한 번만 등장한 문자
	public String solution(String s) {
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 1) sb.append((char) (i + 97));
        }

        return sb.toString();
    }
}