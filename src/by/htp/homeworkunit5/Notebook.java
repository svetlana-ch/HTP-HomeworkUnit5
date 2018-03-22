package by.htp.homeworkunit5;

public class Notebook extends Stationery {
	
	private String format;
	private int numberOfSheets;

	public Notebook(String title, String manufacturer, double price, String format, int numberOfSheets) {
		super(title, manufacturer, price);
		this.format = format;
		this.numberOfSheets = numberOfSheets;
	}
	
	
	@Override

	public String toString() {

		return  super.toString() + " формат " + format + " количество листов " + numberOfSheets;

	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public int getNumberOfSheets() {
		return numberOfSheets;
	}


	public void setNumberOfSheets(int numberOfSheets) {
		this.numberOfSheets = numberOfSheets;
	}
	
	

}
