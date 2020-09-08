package PractiseComparator;

import java.util.Comparator;

public class SortByName implements Comparator<Product>{

	@Override
	public int compare(Product obj1, Product obj2) {
		
		String stroka1 = obj1.getName();
		String stroka2 = obj2.getName();
		
		return stroka1.compareTo(stroka2);
	}

}
