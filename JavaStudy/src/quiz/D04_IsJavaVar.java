/*
 		문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로써 사용할 수 있는 문자열인지
 		
 		검사해주는 메서드를 만들어보세요
 		
 		
https://stackoverflow.com/questions/24265110/get-a-list-of-all-java-reserved-keywords
	
 */

/*	public static String stringCheck(String input) {

		input = "※Dg#asf";

		char arr[] = input.toCharArray();

		// 특수문자 예약어 ?
		for (int i = 0; i < arr.length; i++) {

			if (Character.isAlphabetic(arr[i]) == true) {
				if (Character.isJavaIdentifierPart((arr[0])))
					System.out.println(arr[i] + "변수명이 될 수 있습니다");

			} else if (Character.isWhitespace(arr[i]) == true) {
				System.out.println("변수명이 될 수 없습니다");
				break;

			} else if (Character.isLowerCase(arr[0]) == true) {
				System.out.println("변수명이 될 수 없습니다");
				break;

			} else {
				System.out.println(arr[i] + "은 변수명이 될 수 없습니다");
				break;
			}
		}
		return input;

	}

	public static void main(String[] args) {

		System.out.println(stringCheck(""));

	}
	
	
 */
package quiz;

import javax.lang.model.SourceVersion;

public class D04_IsJavaVar {

	public static boolean isJavaVar(String word) {

		if (SourceVersion.isKeyword(word)) {
			System.out.println("예약어는 변수로 사용할 수 없습니다.");
			return false;
		}

		if (!Character.isJavaIdentifierStart(word.charAt(0))) {
			System.out.printf("[%s]의 첫 번째 글자가 " + "자바 변수에 사용할 수 없는 문자입니다.", word);
			return false;
		}

		for (int i = 1; i < word.length(); ++i) {
			if (!Character.isJavaIdentifierPart(word.charAt(i))) {
				System.out.printf("[%s]의 %d번째 글자가 " + "자바 변수에 사용할 수 없는 문자입니다.", word, i + 1);
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isJavaVar("sevenEleven"));
		System.out.println(isJavaVar("7Eleven"));
		System.out.println("se#ven");
		System.out.println("int");

		System.out.println(SourceVersion.isIdentifier("apple123"));
		System.out.println(SourceVersion.isIdentifier("apple1 23"));
		System.out.println(SourceVersion.isIdentifier("3est"));
	}
}
