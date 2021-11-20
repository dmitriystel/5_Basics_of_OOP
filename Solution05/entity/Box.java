package by.introduction.fifth.OOP5.entity;

public class Box extends Wrapping {

    public Box(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Box: " +
                "color = " + getColor() + ' ' +
                ", price = " + getPrice() + "$";
    }
}
