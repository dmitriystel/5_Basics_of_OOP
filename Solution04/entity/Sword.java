package by.introduction.fifth.OOP4.entity;

public class Sword extends Treasure {
    public Sword(int price, String description) {
        super(price, description);

    }

    public String toString() {
        return "Sword: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
