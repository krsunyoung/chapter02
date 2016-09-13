package chapter02;

public class Swap {

	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		System.out.println( "i : " + i +", j : "+ j);
		swap(i, j);
		System.out.println( "i : " + i +", j : "+ j);
		//stack 구조
		//swap끝에서 stack에 들어갔다가 메모리 빠져나오므로 temp, b, a가 사라져서 다시 그대로 출력된다. 
		//레퍼런스 객체로 교환을 해야한다..? C에서는 포인터
	}
	
	public static void swap(int a,int b){
		int temp = a;
		a=b;
		b=temp;
		
	}
}
