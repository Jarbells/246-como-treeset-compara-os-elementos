package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public int compareTo(Product o) {
		int result = name.toUpperCase().compareTo(o.getName().toUpperCase());
		if (result == 0) {
			result = price.compareTo(o.getPrice());
		}
		return result;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
