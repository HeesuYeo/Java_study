/*
       # 객체의 다형성
       
        - 객체는 다양한 형태를 지닐 수 있다
        - 강아지는 강아지이기도 하고 동물이기도 하다
        - 하지만 동물은 강아지가 아닐 수도 있다 
       
       # 업 캐스팅
       
       	- 자식 타입은 아무 제약없이 부모타입이 될 수 있다
        - 자식 타입은 내부에 부모 타입의 모든 것을 지니고 있기 때문에
          부모 타입으로 변하는것은 아무 문제가 없다
        - 업 캐스팅 된 상태에서는 자식 타입에서 가지고 있던 기능을 사용 할 수 없다
        
       # 다운 캐스팅
       
        - 부모 타입은 강제 타입 캐스팅을 통해서만 자식 타입이 될 수 있다 
        - 만약 잘못된 타입으로 다운 캐스팅되는 경우 에러발생
        
 */
import myobj2.AirFryer;
import myobj2.Electronics;
import myobj2.VacuumCleaner;

public class C08_Polymorphism {
   
	public static void main(String[] args) {

		// 전자제품을 상속받은 클래스의 인스턴스들은
		// 전자제품 타입 변수에 들어갈 수 있다(업캐스팅, 부모 타입으로 올라감)
		VacuumCleaner v1 = new VacuumCleaner();
		AirFryer a1 = new AirFryer();

		Electronics e1 = new Electronics(null, 0);
		Electronics e2 = v1;
		Electronics e3 = a1;

		// 업캐스팅 된 자식 객체는 부모에 존재하는 기능만 사용할 수 있다
		// (자식 클래스에만 존재하던 기능은 사용이 불가능해진다)
		e2.info();
		e2.start();

		// 업캐스팅된 객체가 자식 클래스에만 존재하던 기능을 사용하고 싶다면
		// 다시 원래의 클래스로 변경되어야만 한다 (다운 캐스팅)
		VacuumCleaner cleaner = (VacuumCleaner) e3;
		//cleaner.replaceFilter();
		
		
		
		AirFryer af1 = new AirFryer();
		VacuumCleaner va1 = new VacuumCleaner();

/*		af1.info();
		af1.printManual();
		af1.start();

		va1.info();
		va1.printManual();
		va1.start();
*/
		//instaner of 연산자로
		// 부모 클래스에 원하는 클래스의 인스턴스가 들어있는지 확인 할 수있다

		System.out.println(e1 instanceof AirFryer);
		System.out.println(e2 instanceof AirFryer);
		System.out.println(e3 instanceof AirFryer);
		
		printElectronicsInfo(e1);
		printElectronicsInfo(v1);
		printElectronicsInfo(a1);
		
	}
	public static void printElectronicsInfo(Electronics product) {
		product.info();
	}
}