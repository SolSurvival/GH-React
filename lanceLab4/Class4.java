package lanceLab4;

import java.util.*;

/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

Test cases
countXX("abcxx")  1
countXX("xxx")  2
countXX("xxxx")  3
*/

public class Class4 {
	
	static Scanner input = new Scanner(System.in);

	
	public static void xCount() {
		
		System.out.println("Welcome to the 'XX' counter...");
		System.out.println("Enter a phrase that contains any number of 'xx' and you'll get back how many exist..");
		String str = input.next();
		System.out.println(countChar(str));

	}
	
	static int countChar(String str) {
		char[] arr = str.toCharArray();
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++) {
			if (arr[i] == 'x' && arr[i + 1] == 'x') {
				count++;
			}
		}
		
		return count;
	}

}