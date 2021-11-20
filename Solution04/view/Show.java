package by.introduction.fifth.OOP4.view;

import java.util.List;

import by.introduction.fifth.OOP4.entity.Treasure;

public class Show {
	
    public void showAllTreasures(List<Treasure> treasuresList) {
    	System.out.println("All treasures: ");

        for (Treasure treasures1 : treasuresList) {

        	
            System.out.println(treasures1);
        }
        System.out.println("________________________________________________________________________________________________________________________________________________");

    }
    
    public void showAllTreasuresAmount(List<Treasure> treasuresListAmount) {
        System.out.println("________________________________________________________________________________________________________________________________________________");
    	System.out.println("All treasures amount 30 000: ");


    for (Treasure treasures2 : treasuresListAmount) {

    	
        System.out.println(treasures2);
    	}
    }
}
