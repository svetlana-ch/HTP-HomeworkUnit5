package by.htp.homeworkunit5;

public class Ruler extends Stationery {
	
	private int size;
	private String shape;
	private String material;
	

	public Ruler(String title, String manufacturer, double price, int size, String shape, String material) {
		super(title, manufacturer, price);
		this.size = size;
		this.shape = shape;
		this.material = material;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override

	public String toString() {

		return  super.toString() + " размер " + size + " см, форма " + shape + " материал " + material;

	}
	

}
