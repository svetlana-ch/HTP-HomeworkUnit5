package by.htp.homeworkunit5.comparator;

import java.util.Comparator;

import by.htp.homeworkunit5.Stationery;

public class PriceComparator implements Comparator<Stationery> {

	
	@Override
	public int compare(Stationery o1, Stationery o2) {
		
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		}		

		if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}		

		return 0;
	}
	

}
