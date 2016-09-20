package bit2016.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
		//this안써주면 파라미터 channel이 우선순위가 올라감. 
	}
	public void status(){
		System.out.println( "channel = " +this.channel + ", volume = "+volume + ", power = "+power );
		//위에 this는 안써주면 생략된것
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public void power(boolean on){
		power = on;
	}
	public void volume(int volume){
		this.volume=volume;
	}
	public void volume(boolean up){
		if(up == true){ //==true 생략가능
			volume++;
		}else{
			volume--;
		}
	} //오버로딩 같은 메소드를 가지고 한개씩 줄이고 늘릴수 있다.
	
	public void channel(int channel){
		this.channel=channel;
	}
	public void channel(boolean up){
		if(up){
			channel++;
		}else{
			channel--;
		}
	}
	
	
	
	
	
	
}
