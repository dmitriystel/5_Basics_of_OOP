package by.introduction.fifth.OOP5.entity;

public class WrappingPaper extends Wrapping {	
    public WrappingPaper(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "WrappingPaper: " +
                "color = " + getColor() +
                ", price = " + getPrice() + '$';
    }
}