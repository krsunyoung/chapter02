package chapter02;

import java.io.StreamCorruptedException;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		Person p2 = new Student(10);
		
//		Student s = new Student();
//		Person p3 = s;  두개가 아래와 같다.
		Person p3 = new Student();
		
		Student s = (Student)p3; //down casting 명시적(explicit) 캐스팅을 해야 한다.
		//같은 객체일때만 가능하다.
		
		Person p4 = s; //up casting 암시적(implicit) 캐스팅을 안해줘도 된다.
		
		
	}

}
