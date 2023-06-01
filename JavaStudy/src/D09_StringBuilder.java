/*
 		# StringBuilder
 			
 			 - 문자열을 빠르게 조립할 때 사용하는 클래스 (+= 보다 빠름)
 			
	 		String은 더할 때마다 새로운 인스턴스를 생성하기 때문에(new를 계속함) 느리다
	 		StringBuilder는 최초에 인스턴스를 한번 만들고 기능을 활용하기 때문에 훨씬 빠르다

 */
public class D09_StringBuilder {

	public static void main(String[] args) {

		String str1 = "";

		str1 += "a";
		str1 += "p";
		str1 += "p";
		str1 += "l";
		str1 += "e";

		System.out.println(str1);

		StringBuilder sb1 = new StringBuilder();

		// append() : +=과 같음
		sb1.append("a");
		sb1.append("p");
		sb1.append("p");
		sb1.append("l");
		sb1.append("e");

		// insert(offset, anything) : 원하는 위치에 원하는 내용을 끼워 넣는다

		sb1.insert(2, "banana");
		System.out.println(sb1);

		// reverse() : 모든 내용을 거꾸로

		sb1.reverse();
		System.out.println(sb1);

		// substring(start, end) : 원하는 만큼 자른 String 인스턴스를 반환
		String substr1 = sb1.substring(0, 5);
		String substr2 = sb1.substring(5, 10);

		System.out.println(substr1);
		System.out.println(substr2);

		// setLength() : 만들던 문자열의 길이를 강제로 변경

		sb1.setLength(9);
		System.out.println(sb1);

		// setCharAt(index, ch); : 원하는 위치의 문자를 변경
		sb1.setCharAt(0, 'Z');
		System.out.println(sb1);

		// replace(start, end, "after") : 원하는 만큼의 문자열을 다른 문자열로 교체한다
		sb1.replace(3, 5, "xxxxxxxx");
		System.out.println(sb1);

		// sb1.delete(start, end) : 원하는 만큼의 문자열삭제
		sb1.delete(3, 10);
		System.out.println(sb1);

		// sb1.deleteCharAt(index) : 원하는 위치의 문자를 하나 삭제
		sb1.deleteCharAt(6);
		System.out.println(sb1);

		String BuildResult = sb1.toString();
		System.out.println(BuildResult);

		long startTime = System.currentTimeMillis();
		String test1 = "";

		for (int i = 0; i < 100000; i++) {
			test1 += "a";

			if (i % 20 == 19) {
				test1 += "\n";

			}

		}
		
		System.out.println
		("실행 시간 : " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();

		StringBuilder test2 = new StringBuilder();

		for (int i = 0; i < 150000; i++) {
			test2.append((char) ('a' + i % 26));

			if (i % 20 == 19) {
				test2.append("\n");
			}

		}

		System.out.println
		("실행 시간2 : " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
