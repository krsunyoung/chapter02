package bit2016.tv;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV(7, 20 , false);
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		//tv.hashCode();
		//tv.toString(); 
		//tv가 자동으로 위 두개를 object메소드에서 상속을 받음. 따로 만들어주지 않았다. 나중에 object클래스 배울때 다시 설명
	}

}
