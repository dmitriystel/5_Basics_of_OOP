package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Wrapping;
import by.introduction.fifth.OOP5.entity.WrappingPaper;

public class WrappingPaperFactory implements WrappingFactory {	
	
    @Override
    public Wrapping createWrapping(String color, int price) {
        return new WrappingPaper(color, price);
    }
}