package by.introduction.fifth.OOP4.entity;

public class Ring extends Treasure {	
    public Ring(int price, String description) {
        super(price, description);
    }

    public String toString() {
        return "Ring: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
