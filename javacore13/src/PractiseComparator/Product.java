package PractiseComparator;

public class Product {
	
	private String name;
	private double price;
	private int quality;
	private boolean trueFalse;
		
	public Product(String name, double price, int quality, boolean trueFalse) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
		this.trueFalse = trueFalse;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	
	public boolean isTrueFalse() {
		return trueFalse;
	}

	public void setTrueFalse(boolean trueFalse) {
		this.trueFalse = trueFalse;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quality=" + quality + ", trueFalse=" + trueFalse + "]";
	}
	
	
	
}
