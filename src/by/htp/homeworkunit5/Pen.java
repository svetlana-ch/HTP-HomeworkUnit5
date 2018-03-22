package by.htp.homeworkunit5;

import by.htp.homeworkunit5.enumclass.Color;
import by.htp.homeworkunit5.enumclass.TypeOfInk;

public class Pen extends WritingAccessory{
	
	private TypeOfInk typeOfInk;
	
	public Pen(String title, String manufacturer, double price, Color color, TypeOfInk typeOfInk) {
		super(title, manufacturer, price, color);
		this.typeOfInk = typeOfInk;
	}
	
	

	public TypeOfInk getTypeOfInk() {
		return typeOfInk;
	}



	public void setTypeOfInk(TypeOfInk typeOfInk) {
		this.typeOfInk = typeOfInk;
	}



	@Override

	public String toString() {

		return  super.toString() + " тип чернил: " + typeOfInk;

	}

}
