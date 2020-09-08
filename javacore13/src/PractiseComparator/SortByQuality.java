package PractiseComparator;

import java.util.Comparator;

public class SortByQuality implements Comparator<Product>{

	@Override
	public int compare(Product obj1, Product obj2) {
		
		int quality1 = obj1.getQuality();
		int quality2 = obj2.getQuality();
		
		if(quality1 > quality2) {
			return -1;
		}
		else if(quality1 < quality2) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
