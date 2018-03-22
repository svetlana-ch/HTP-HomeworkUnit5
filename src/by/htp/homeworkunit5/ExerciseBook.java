package by.htp.homeworkunit5;

import by.htp.homeworkunit5.enumclass.TypeOfExBook;

public class ExerciseBook extends Notebook{
	
	private TypeOfExBook typeOfExBook;

	public ExerciseBook(String title, String manufacturer, double price, String format, 
			int numberOfSheets, TypeOfExBook typeOfExBook) {
		super(title, manufacturer, price, format, numberOfSheets);
		this.typeOfExBook = typeOfExBook;
	}

	public TypeOfExBook getTypeOfExBook() {
		return typeOfExBook;
	}

	public void setTypeOfExBook(TypeOfExBook typeOfExBook) {
		this.typeOfExBook = typeOfExBook;
	}
	
	@Override

	public String toString() {

		return  super.toString() + " тип " + typeOfExBook;

	}
	

}
