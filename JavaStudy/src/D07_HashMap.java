import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import myobj.Peach;

/*
 		# Map
 		
 			- 데이터를 Key/value 방식으로 저장하는 자료구조
 			
 			- 인덱스 번호 대신 Key값을 이용해 Value에 접근
 			
 			- Key값은 중복 허용 안함
 

 */
public class D07_HashMap {

	public static void main(String[] args) {

		HashMap<String, Peach> map1 = new HashMap<>();

		// Put(k,v) : 해당 키에 값을 저장

		map1.put("김민호", new Peach());
		map1.put("먹던것", new Peach());

		System.out.println(map1);
		// Get(k) : 키값에 해당하는 Value를 꺼낸다. 키를 찾지 못하면 null 반환

		Peach p1 = map1.get("최민호");
		Peach p2 = map1.get("김민호");

		System.out.println(p1);
		System.out.println(p2);

		HashMap<String, String> navi = new HashMap<>();
		// HashMap<String, MemberInfo> members = new HashMap<>();

		navi.put("우리 집", "서울시 무슨구 무슨동 무슨무슨 아파트 XXX-XXXX");
		navi.put("회사", "서울시 무슨구 가산디지털 ㅌㅌ밸리 XXX-XXXX");
		navi.put("마트", "...");

		System.out.println(navi);
		

		// putIfAbsent(k,v); : 새로운 등록일때만 키와 데이터를 추가 (null 리턴)
		// 이미 키와 데이터가 존재하면 들어있는 값을 리턴 (데이터 수정 x)

		String existValue = navi.putIfAbsent("우리집", "경기도 구리");
		navi.put("마트", "서울 특별시 구로구 디지털길32길 43");

		System.out.println(existValue);
		System.out.println(navi);

		// Map 탐색 방법

		// Key.Set(); : 해당 맵의 키들로 이루어진 Set을 반환
		Set<String> keys = navi.keySet();

		for (String key : keys) {
			System.out.printf("%s=%s\n", key, navi.get(key));

		}

		// values() : 해당 맵의 value들로 이루어진 Collection을 반환
		List<String> valueList = new ArrayList<>(navi.values());

		for (String value : valueList) {
			System.out.println(value);

		}
		
		// containsKey("key") : Map의 키값에 해당키가 있는지알려줌
		System.out.println(navi.containsKey("우리집"));
		System.out.println(navi.containsKey("초밥무한리필"));
		
		// containsValue(value) :Map의 값에 해당 값이 있는지 알려줌
		System.out.println(navi.containsValue("..."));
		
		
	}

}
