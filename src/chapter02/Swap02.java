package chapter02;

public class Swap02 {

	public static void main(String[] args) {
		Value i = new Value();
		i.setValue( 100 );
		
		Value j = new Value();
		j.setValue( 200);
		System.out.println(" i :"+i.getValue()+" j :"+ j.getValue());
		swap( i , j);
		System.out.println(" i :"+i.getValue()+" j :"+ j.getValue());
		
		//Swap 과 비교

	}
	public static void swap(Value a, Value b){
		int temp= a.getValue();
		a.setValue(b.getValue());
		b.setValue(temp);
		
	}

}
