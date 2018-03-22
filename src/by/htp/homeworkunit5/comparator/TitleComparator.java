package by.htp.homeworkunit5.comparator;

import java.util.Comparator;

import by.htp.homeworkunit5.Stationery;

public class TitleComparator implements Comparator<Stationery>{

	@Override
	public int compare(Stationery o1, Stationery o2) {
		
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}
