package by.introduction.fifth.OOP5.entity;

public class Chocolate extends Sweets {	
    public Chocolate(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }

    public String toString() {
        return "Chocolate: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
