package by.introduction.fifth.OOP4.factory;

import java.util.Random;

import by.introduction.fifth.OOP4.entity.Ring;
import by.introduction.fifth.OOP4.entity.Treasure;

public class RingFactory implements TreasureFactory {	

    public Treasure create() {
        String []adjective = {"diamond", "gold ", "silver ", "platinum "};	
        
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1) ]; 
      
        return new Ring(r.nextInt(7000) , firstAdjective + " " + "Ring"); 
    }
}
