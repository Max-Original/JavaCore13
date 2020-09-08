package PractiseComparator;

import java.util.Comparator;

public class sortByboolean implements Comparator<Product>{

	@Override
	public int compare(Product obj1, Product obj2) {
		
		boolean bool1 = obj1.isTrueFalse();
		boolean bool12 = obj2.isTrueFalse();
		
		
		return 0;
	}
	
	

}
