package by.introduction.fifth.OOP5.entity;

public class Candy extends Sweets {	

    public Candy(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }

    public String toString() {
        return "Candy: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
