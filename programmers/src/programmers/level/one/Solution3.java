package programmers.level.one;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		long n = sc.nextLong();
		String s = n+"";
		int answer[] = new int[s.length()];
		for(int i=s.length()-1; i>=0; i--) {
			answer[s.length()-i-1] = s.charAt(i) - '0';
		}
		
		
		System.out.println(Arrays.toString(answer));
	}

}
