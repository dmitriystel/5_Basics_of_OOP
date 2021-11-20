package by.introduction.fifth.OOP4.logic;

import java.util.ArrayList;
import java.util.List;

import by.introduction.fifth.OOP4.entity.Treasure;
import by.introduction.fifth.OOP4.factory.NecklaceFactory;
import by.introduction.fifth.OOP4.factory.RandomFactories;
import by.introduction.fifth.OOP4.factory.RingFactory;
import by.introduction.fifth.OOP4.factory.StatuetteFactory;
import by.introduction.fifth.OOP4.factory.SwordFactory;
import by.introduction.fifth.OOP4.factory.TreasureFactory;

public class Cave {
	  
    private List<Treasure> treasuresList;	
    
   
    private List<Treasure> treasuresListAmount;

    {
      
        treasuresList = new ArrayList<>();	
        treasuresListAmount = new ArrayList<>(); 
    }

    public List<Treasure> getTreasuresList() {
        return treasuresList;
    }

    public void setTreasuresList(List<Treasure> treasuresList) {
        this.treasuresList = treasuresList;
    }
    
    public List<Treasure> getTreasuresListAmount() {
        return treasuresListAmount;
    }

    public void setTreasuresListAmount(List<Treasure> treasuresListAmount) {
        this.treasuresListAmount = treasuresListAmount;
    }
    
    public void addTreasures() {	

        RandomFactories random = new RandomFactories(new TreasureFactory[]{
                new RingFactory(), new NecklaceFactory(), new SwordFactory(),
                new StatuetteFactory()
        });
        for (int i = 0; i < 100; i++) {
            Treasure treasure = random.create();
            treasuresList.add(treasure);
        }
    }

    public Treasure mostExpensive() {	
 
        Treasure expensive = null;
        int price = Integer.MIN_VALUE;
        for (int i = 0; i < treasuresList.size(); i++) {
            if (treasuresList.get(i).getPrice() > price) {
                price = treasuresList.get(i).getPrice();
                expensive = treasuresList.get(i);
            }
        }
        return expensive;
    }

    public void TresuresForGivenAmount(int amount) {
		
    	int sum = amount;
    	
		int i = 0;
		
			for (Treasure treasure : treasuresList) {
				
			if (sum > 0) {
	   			sum -= treasuresList.get(i).getPrice();
    			treasuresListAmount.add(treasure);
				}

			}	    			    			    			    					  		    		    	
    }
}
    
    
    
    
    
    
    
    




 
 
    
    
