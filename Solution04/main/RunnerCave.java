package by.introduction.fifth.OOP4.main;
/*
 5. Basics of OOP
 
    Задача 4.

	Создать консольное приложение, удовлетворяющее следующим требованиям:
	• Приложение должно быть объектно-, а не процедурно-ориентированным.
	• Каждый класс должен иметь отражающее смысл название и информативный состав.
	• Наследование должно применяться только тогда, когда это имеет смысл.
	• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
	• Классы должны быть грамотно разложены по пакетам.
	• Консольное меню должно быть минимальным.
	• Для хранения данных можно использовать файлы.
 */
import java.io.IOException;


import by.introduction.fifth.OOP4.logic.Cave;
import by.introduction.fifth.OOP4.view.Show;

public class RunnerCave {
    public static void main(String[] args) throws IOException {
            
        Cave cave = new Cave();
        Show show = new Show();
        
        cave.addTreasures();
        show.showAllTreasures(cave.getTreasuresList());
                                
        System.out.println("Most expensive treasure: " + cave.mostExpensive());
               
        cave.TresuresForGivenAmount(30000);
        show.showAllTreasuresAmount(cave.getTreasuresListAmount());
    }
}