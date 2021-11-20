package by.introduction.fifth.OOP4.entity;

import java.util.Objects;
								
public abstract class Treasure { 
    private int price;
    private String description;
    
    public Treasure() {
    }
    
    public Treasure(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	@Override
	public int hashCode() {
		return Objects.hash(description, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(description, other.description) && price == other.price;
	}

	@Override
	public String toString() {
		return "Treasure [price=" + price + ", description=" + description + "]";
	}

}
