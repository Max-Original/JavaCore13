package PractiseComparable;

import java.util.TreeSet;

public class PractiseComparable implements Comparable{

	String stroka;
	int nomer;
	
	public PractiseComparable(String stroka, int nomer) {
		this.stroka = stroka;
		this.nomer = nomer;
	}
	
	@Override
	public int compareTo(Object obj) {
		PractiseComparable entry = (PractiseComparable) obj;
		
		int result = stroka.compareTo(entry.stroka);
		if(result != 0) {
			return result;
		}
		
		result = nomer - entry.nomer;
		if(result != 0) {
			return (int) result / Math.abs(result);
		}
		return 0;
	}
public static void main(String[] args) {
	TreeSet<PractiseComparable> practiseOne = new TreeSet<>();
	practiseOne.add(new PractiseComparable("Max", 111));
	practiseOne.add(new PractiseComparable("Max", 222));
	practiseOne.add(new PractiseComparable("Masha", 3213));
	practiseOne.add(new PractiseComparable("Masha", 3123));
	practiseOne.add(new PractiseComparable("Mavdrogon", 88478));
	
	for(PractiseComparable probigtu : practiseOne) {
		System.out.println("Stroka = "+probigtu.stroka + ", Nomer = "+probigtu.nomer);
	}
}
}
