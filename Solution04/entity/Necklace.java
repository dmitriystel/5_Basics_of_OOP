package by.introduction.fifth.OOP4.entity;

public class Necklace extends Treasure {	
    public Necklace(int price, String description) {
        super(price, description);
    }

    public String toString() {
        return "Necklace: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
