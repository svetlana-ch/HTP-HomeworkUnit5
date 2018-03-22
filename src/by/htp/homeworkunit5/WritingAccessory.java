package by.htp.homeworkunit5;

import by.htp.homeworkunit5.enumclass.Color;

public abstract class WritingAccessory extends Stationery {
	
	private Color color;

	

	public WritingAccessory(String title, String manufacturer, double price, Color color) {
		super(title, manufacturer, price);
		this.color = color;
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override

	public String toString() {

		return  super.toString() + " цвет " + color;

	}
	

	
	

}
