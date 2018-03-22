package by.htp.homeworkunit5;


import java.util.List;

import by.htp.homeworkunit5.enumclass.Color;
import by.htp.homeworkunit5.enumclass.TypeOfExBook;
import by.htp.homeworkunit5.enumclass.TypeOfInk;

public class Main {

	public static void main(String[] args) {
							
		Pen pen1 = new Pen("Ручка шариковая", "АБСД", 0.80, Color.BLACK, TypeOfInk.INK);
		Pen pen2 = new Pen("Ручка гелевая", "АБСД", 1.80, Color.BLACK, TypeOfInk.GEL);
		Pen pen3 = new Pen("Ручка шариковая", "АБСД", 3.80, Color.BLUE, TypeOfInk.INK);
		Pen pen4 = new Pen("Ручка шариковая", "ПАРКЕР", 2.40, Color.RED, TypeOfInk.INK);
		Pen pen5 = new Pen("Ручка капилярная", "АБСД", 3.00, Color.BLUE, TypeOfInk.CAPPILARY);
		Pen pen6 = new Pen("Ручка гелевая", "АБСД", 0.80, Color.GREEN, TypeOfInk.GEL);
				
		Pencil pensil1 = new Pencil("Карандаш простой", "АБСД", 0.90, Color.BLACK, "без механизма");
		Pencil pensil2 = new Pencil("Карандаш механисеский", "АБСД", 0.95, Color.BLACK, "без механизма");
		Pencil pensil3 = new Pencil("Карандаш", "АБСД", 3.22, Color.BLUE, "механический");
		Pencil pensil4 = new Pencil("Карандаш", "АБСД", 1.90, Color.RED, "без механизма");
		Pencil pensil5 = new Pencil("Карандаш", "АБСД", 1.90, Color.GREEN, "без механизма");		
		
		Ruler ruler1 = new Ruler("Линейка прозрачная", "ДЕЖЗ", 1.68, 40, "прямая", "пластик");
		Ruler ruler2 = new Ruler("Линейка транспортир", "ДЕЖЗ", 1.88, 40, "полукруглая", "дерево");
		Ruler ruler3 = new Ruler("Линейка офицерская", "ДЕЖЗ", 1.98, 40, "прямоугольнаяя", "пластик");		
		
		ExerciseBook exerciseBook1 = new ExerciseBook("Тетрадь", "ДОБРУШ", 2.05, "А5", 96, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook2 = new ExerciseBook("Тетрадь", "ДОБРУШ", 2.05, "А5", 48, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook3 = new ExerciseBook("Тетрадь", "ДОБРУШ", 2.05, "А5", 96, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook4 = new ExerciseBook("Тетрадь", "ДОБРУШ", 2.05, "А5", 96, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook5 = new ExerciseBook("Тетрадь", "ДОБРУШ", 3.05, "А4", 96, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook6 = new ExerciseBook("Тетрадь", "ДОБРУШ", 2.05, "А5", 48, TypeOfExBook.В_КЛЕТКУ);
		ExerciseBook exerciseBook7 = new ExerciseBook("Тетрадь", "ДОБРУШ", 0.25, "А4", 12, TypeOfExBook.В_БОЛЬШУЮ_КЛЕТКУ);
		ExerciseBook exerciseBook8 = new ExerciseBook("Тетрадь", "ДОБРУШ", 0.25, "А5", 12, TypeOfExBook.В_ЛИНЕЙКУ);
		ExerciseBook exerciseBook9 = new ExerciseBook("Тетрадь", "ДОБРУШ", 0.25, "А5", 12, TypeOfExBook.В_КОСУЮ_ЛИНЕЙКУ);
		
		BegginerBox boxMisha = new BegginerBox("Миша Михайлов");
		BegginerBox boxKatya = new BegginerBox("Катя Иванова");
		
		boxMisha.add(pen1, pen2, pen4, pen6, pensil1, pensil3, pensil4, ruler1, ruler3, 
				exerciseBook1, exerciseBook2, exerciseBook5, exerciseBook7, exerciseBook8);
		boxKatya.add(pen1, pen2, pen3, pen6, pensil1, pensil2, pensil2, ruler1, ruler2, 
				exerciseBook1, exerciseBook3, exerciseBook4, exerciseBook7, exerciseBook9);
		
		boxMisha.print();
		boxKatya.print();
		System.out.println("***Сортировка по цене******************************");
		boxMisha.sortByPrice();
		boxMisha.print();
		System.out.println("***Сортировка по наименованию******************************");
		boxMisha.sortByTitle();
		boxMisha.print();
		System.out.println("***Сортировка  по наименованию и цене******************************");
		boxMisha.sortByTitleAndPrice();
		boxMisha.print();
		System.out.println("***Поиск по тексту******************************");
		List<Stationery> searchList = boxMisha.searchByTitle("тетрадь");		
		for (Stationery obj : searchList) {
		System.out.println(obj.toString());
		}
		
		System.out.println(searchList.toString().toUpperCase());
		
		System.out.println(boxMisha.getListStationery().toString());
		System.out.println(boxMisha.getListStationery().toString().contains("нейка")); //true
		
		
		
		System.out.println("***Поиск по тексту 2 ******************************");		
		
			for (Stationery obj : boxMisha.getListStationery()) {
				if (obj.toString().contains("нейка"))
				System.out.println(obj.toString());
				}
			
		
		
		
	}

}
