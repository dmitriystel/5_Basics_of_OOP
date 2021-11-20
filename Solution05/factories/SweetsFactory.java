package by.introduction.fifth.OOP5.factories;

import by.introduction.fifth.OOP5.entity.Sweets;

public interface SweetsFactory {
    Sweets createSweets(String name, int price, String shape, String taste);
}
