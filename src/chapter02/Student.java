package chapter02;

public class Student extends Person {
	public Student(){
		age = 40; //Person 부모의 디폴트 접근자는 접근 가능 (단, 같은 패키지에서만 가능 )
		name ="Sun"; //protected는 자식에서 접근가능. (다른 패키지에서도 가능)
		// height = 172; //private은 접근 불가.
		weight = 75; //public은 접근 가능.
		
		//default , protected , public은 자식에서 받을 수 있다. 
	}
}
