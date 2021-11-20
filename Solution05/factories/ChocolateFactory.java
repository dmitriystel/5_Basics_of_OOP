package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Chocolate;
import by.introduction.fifth.OOP5.entity.Sweets;

public class ChocolateFactory implements SweetsFactory {	
	
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {
        return new Chocolate(name, price, shape, taste);
    }
}