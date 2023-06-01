/*
 	리스트에 String 타입 랜덤 과일 이름 300개를 추가하고 
 	
 	각 과일이 몇 번 등장했는지 세어보세요
 	(apple, banana, kiwi, orange, grape, pineapple, peach  
 */

package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CountRandomFruits {

	public static void main(String[] args) {
		
		String[] fruitNames = { "fruits", "apple", "banana",
				"kiwi", "orange", "grape", "pineapple", "peach" };
		List<String> fruits = new ArrayList<>();

		Random r = new Random();

		for (int i = 0; i < 300; i++) {
			fruits.add(fruitNames[r.nextInt(fruitNames.length)]);
		}
		HashMap<String, Integer> fruitCount = new HashMap<>();

		for (String fruit : fruits) {
			// 새로운 과일이 등장했을때는 1을 넣고 null리턴
			// 이미 값이 들어가 있을때는 값을 꺼낸다
			Integer count = fruitCount.putIfAbsent(fruit, 1);

			// 이미 count를세기 시작했던과일이라면 1증가 시킨다
			if (count != null) {
				fruitCount.put(fruit, count + 1);
			}

		}
		System.out.println(fruitCount);
	}

}
//방법1
//		int size = fruits.size();
//		
//		int[] count =new int[fruitNames.length];
//		
//		for (int i = 0; i < size; i++) {
//			String fruit = fruits.get(i);
//			if (fruit.equals("apple")) {
//				count[0] +=1;
//				
//			}else if (fruit.equals("banana")) {
//				count[1] += 1;
//			}
//		}
// 방법2
//		System.out.println(Arrays.toString(count));
//		for (int i = 0; i < fruitNames.length; i++) {
//			System.out.printf("%s's count : %d\n", fruitNames[i], Collections.frequency(fruits, fruitNames[i]));
//		

