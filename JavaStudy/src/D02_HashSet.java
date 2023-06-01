import java.util.ArrayList;
import java.util.HashSet;

/*
 
		# Set
		
			- 집합을 구현해 놓은 클래스
			
			- 요소로 같은 값이 들어오는 것을 허용하지 않는다
			
		# Hash
		
			- 같은 값을 넣으면 항상 일정한 값이 나와야 하는 단방향성 알고리즘
			
			- 결과 값을 통해 원래 값을 유추 할 수 없어야 한다
			
			- 중복체크 & 데이터 위,변조 체크에 주로 사용한다
			
			- 주로 특정 데이터의 고유번호로 활용하기도 한다
				 
			- 해쉬의 결과는 규칙적이지 않기 때문에 
			  해쉬로 만들어진 알고리즘은 순서를 알 수 없다
			
			-  

			    Hash Ex)
			   
		         값       결과  		 
  				"ABC" => kzsjfgO:LANbf3545374
  				"ABC1"=> SDng;/k6456156lajnsb
  				"CAT"
  				
 */

public class D02_HashSet {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<>();

		System.out.println("apple".hashCode());
		System.out.println("apple".hashCode());
		System.out.println("Hello everyone. my name is Sausage".hashCode());
		System.out.println("Hello everyone my name is Sausage".hashCode());

		// set.add(item) : 데이터를 추가한다 (중복은 알아서 제거됨)

		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");

		System.out.println(fruits);

		// forEach : 배열, 리스트, 집합 등에서 요소를 하나씩 꺼내면 반복하는 문법

		String[] animals = { "lion", "tiger", "bear", "dolphin" };

		for (String animal : animals) {
			System.out.println(animal);
		}

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// set.contains(item)
		System.out.println("수박 있니? : " + fruits.contains("수박"));

		// set.remove(item)
		System.out.println("삭제성공? : " + fruits.remove("applee"));

		// set.removeAll(collection) : 포함된 모든 내용삭제
		HashSet<String> toRemove = new HashSet<>();

		toRemove.add("watermelon");
		toRemove.add("peach");
		toRemove.add("grape");

		System.out.println(fruits.removeAll(toRemove));
		System.out.println(fruits);

		// Set도 Collection이기 때문에 다른 컬렉션으로의 변환이 자유롭다

		ArrayList<String> fruitList = new ArrayList<>(fruits);

		System.out.println(fruitList);
		System.out.println(fruitList.get(0));

	}

}
