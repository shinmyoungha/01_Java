package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	// 다형성 확인 예제
	public void ex1() {
		
		// Car 객체 생성
		Car car = new Car();
// 부모타입 참조변수 = 부모객체주소
		
		// Tesla 객체 생성
		Tesla tesla = new Tesla();
// 자식타입 참조변수 = 자식객체주소
		
		// -> 여기까진 당연한 것
		
		// ***************** 다형성 *****************
		
		// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla(); // 오류 발생 안함
		// Tesla 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함
		// -> 업 캐스팅
		
		Car car3 = new Spark();
		// Spark 객체를 참조하는 변수의 타입이 Car
		// Spark 객체가 Car 객체로 변화함
		// -> 업 캐스팅
		
		
		
		// 1) 자식 객체가 부모 객첼 변화하였기 때문에
		//	  자식마의 고유한 필드, 메서드를 사용할 수 없다.
		
		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car 본인의 메서드 모두 사용 가능
		
		// 1-2) Trsla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		// Tesla 부모, 본인의 매서드 모두 사용 가능
		
		// 1-3) car2 (부모 = 자식(Tesla))
		car.setEngine("전기모터");
		car.setFuel("전기");
		car.setWheel(4);
		// car2.setBatteryCapacity(1000000);
		// The method setBatteryCapacity(int) is undefined for the type Car
		
		// car3(부모 = 자식(Spark))
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		// car3.discountOfter(0.5);
		// The method discountOfter(double) is undefined for the type Car
	
		// -> car2,car3는 부모타입 참조변수(Car)이기 때문에
		// Trsla, Spark와 같은 자식객체의 고유 필드, 메서드 사용 불가
		
		// ------------------------------------------------
		
		// 2) 다형성을 이용한 객체배열
		
		// 객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// 다형성을 이용한 객체배열 : 
		// 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
		// 각 요소 Car 타입 참조변수
		
		
		arr[0] = car; // Car 주소
		
		arr[1] = car2; // Tesla 주소
		
		arr[2] = car3; // Spark 주소

	
	
	}
}
