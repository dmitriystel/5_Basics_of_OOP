package by.introduction.fifth.OOP4.entity;

public class Statuette extends Treasure { 
    public Statuette(int price, String description) {
        super(price, description);
    }

    public String toString() {
        return "Statuette: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
