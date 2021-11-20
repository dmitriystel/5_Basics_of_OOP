package by.introduction.fifth.OOP5.main;
/*
 * 5. Basics of OOP
 
      Задача 5.

	Создать консольное приложение, удовлетворяющее следующим требованиям:
	• Корректно спроектируйте и реализуйте предметную область задачи.
	• Для создания объектов из иерархии классов продумайте возможность использования 
	  порождающих шаблонов проектирования.
	• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
	• для проверки корректности переданных данных можно применить регулярные выражения.
	• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
	• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
	
	Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий 
	собой подарок). Составляющими целого подарка являются сладости и упаковка. 
 */
import java.io.IOException;

import by.introduction.fifth.OOP5.entity.Gift;

public class Runner {
    public static void main(String[] args) throws IOException {
    	
        Gift gift = new Gift();
        gift.createCandies("Chocolate","Milka", 9,"rectangle","With nuts");
        gift.createWrapping("Box","Blue", 1);
        gift.calculatePrice();
        System.out.println(gift);

        Gift gift2 = new Gift();
        gift2.createCandies("Chocolate","Milka", 9,"rectangle","With nuts");
        gift2.createWrapping("Box","Blue", 1);
        gift2.calculatePrice();
        System.out.println(gift2);

        System.out.println(gift.equals(gift2));
    }
}
