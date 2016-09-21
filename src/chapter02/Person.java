package chapter02;

public class Person {
	
	int age; //default access
	protected String name; //protected 
	private int height;
	public int weight;
	
	public Person(){	
		System.out.println("person() called");
	}
	public Person(int age){
		System.out.println("person(int age) called");
	}
}
