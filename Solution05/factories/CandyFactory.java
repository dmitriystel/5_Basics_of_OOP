package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Candy;
import by.introduction.fifth.OOP5.entity.Sweets;

public class CandyFactory implements SweetsFactory {
	
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {

        return new Candy(name, price, shape, taste);
    }
}
