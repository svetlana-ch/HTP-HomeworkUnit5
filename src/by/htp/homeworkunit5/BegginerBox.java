package by.htp.homeworkunit5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.htp.homeworkunit5.comparator.PriceComparator;
import by.htp.homeworkunit5.comparator.TitleComparator;

public class BegginerBox {
	
	private String user;
	private List<Stationery> listStationery;
	
	public BegginerBox(String user) {
		this.user = user;
		this.listStationery = new ArrayList<Stationery>();
		
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<Stationery> getListStationery() {
		return listStationery;
	}
	public void setBegginerBox(List<Stationery> listStationery) {
		this.listStationery = listStationery;
	} 
	
	
	public void add(Stationery... objs) {
		for (Stationery obj : objs) {
			listStationery.add(obj);
		}
	}

	public void print() {

		int count = 1;
		for (Stationery obj : listStationery) {
			System.out.println(count + ". " + obj.toString());
			count++;
		}

	}

	public List<Stationery> searchByTitle(String text) {

		List<Stationery> results = new ArrayList<>();
		for (Stationery obj : listStationery) {
			if (obj.getTitle().toLowerCase().contains(text.toLowerCase())) {
				results.add(obj);
			}
		}
		return results;
	}

	public List<Stationery> sortByPrice() {

		PriceComparator priceComparator = new PriceComparator();
		listStationery.sort(priceComparator);
		return listStationery;
	}

	public List<Stationery> sortByTitle() {

		TitleComparator titleComparator = new TitleComparator();
		listStationery.sort(titleComparator);
		return listStationery;
	}

	public List<Stationery> sortByTitleAndPrice() {
		Comparator<Stationery> titleAndPriceComparator = new TitleComparator().thenComparing(new PriceComparator());

		listStationery.sort(titleAndPriceComparator);
		return listStationery;
	}

}
