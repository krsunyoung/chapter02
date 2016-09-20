package bit2016.paint;

public abstract class Shape {
	//abstract 메소드를 가지고 있는 것은 abstract 클래스를 가지고 있어야 한다.
	
	private String fillColor;
	private String lineColor;
	
//	public void draw(){
//		System.out.println("구체적인 도형은 상속을 받아 자식 클래스에서 구현하세요");
//	}
	public abstract void draw(); //추상메소드

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
