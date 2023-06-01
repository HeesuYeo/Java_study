package myobj2.parking;

public class CarType {
	
	
	final public static CarType NORMAL = new CarType(0);
	final public static CarType DISABLED = new CarType(1);
	final public static CarType KID = new CarType(2);
	final public static CarType LIGHTCAR = new CarType(3); //static을 붙여서 꺼내다 쓰면 인스턴스생성을 제한해서 계속 쓰기 때문에 '==' 비교가 가능해진다.
	
	
	private static String[] displayNames = {"일반", "장애인", "유아동승", "경차"};
	
	
	int value;
	
	private CarType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getDisplayName() {
	return displayNames[value];
}
	
	//public String get
	public boolean equals(Object obj) {
		return this.value == ((CarType)obj).value;
	}

	
}
