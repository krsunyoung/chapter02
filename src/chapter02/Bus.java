package chapter02;

public class Bus extends Car {
	public void drve(){
		//speed=0;
		//Car 에  private 는 자기 클래스에만 쓸수 있으므로 위와같이 쓰면 못 불러온다.
		//protected 는 상속 받는 클래스를 써줄수 있기 때문에 아래와 같이 쓸수 있으며
		//extends Car를 해주거나 클래스 추가할때 Browse 에서 추가 클래스를 찾아서 입력해 주면 된다. 
		
		
		accelator = 0;
		
	}
}
