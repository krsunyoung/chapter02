package com.bit2016.paint.shape;

public abstract class Shape {
	//abstract 메소드를 가지고 있는 것은 abstract 클래스를 가지고 있어야 한다.
	
	private String fillColor;
	private String lineColor;
 
	public Shape(){
	} //아래를 만들고 기본 생성자를 안만듦면 다른 것이 에러 난다. 아니면 자식 클래스에  super("","");
	//기본 생성사가 자동으로 안들어 가기 때문에 Rectangle 같은 것들이 에러나지않지만 아래를 만들어주면 기본 생성자는 사라져서 에러난다.
	public Shape(String fillColor, String lineColor){
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	} 
	
//	public void draw(){
//		System.out.println("구체적인 도형은 상속을 받아 자식 클래스에서 구현하세요");
//	}
//	public abstract void draw(); //추상메소드 (구현이 안되는 메소드)
	public abstract double calculateArea(); 

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}
