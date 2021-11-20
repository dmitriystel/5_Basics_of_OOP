package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Wrapping;

public interface WrappingFactory {	
    Wrapping createWrapping(String color, int price);
}
