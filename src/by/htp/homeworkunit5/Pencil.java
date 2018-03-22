package by.htp.homeworkunit5;

import by.htp.homeworkunit5.enumclass.Color;

public class Pencil extends WritingAccessory{
	
	private String mechanizm;
	
	public Pencil(String title, String manufacturer, double price, Color color, String mechanizm) {
		super(title, manufacturer, price, color);
		this.mechanizm = mechanizm;
	}

	@Override

	public String toString() {

		return  super.toString() + " тип механизма: " + mechanizm;

	}

}
