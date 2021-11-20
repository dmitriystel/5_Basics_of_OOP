package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Box;
import by.introduction.fifth.OOP5.entity.Wrapping;

public class BoxFactory implements WrappingFactory {
	
    @Override
    public Wrapping createWrapping(String color, int price) {
        return new Box(color, price);
    }
}
