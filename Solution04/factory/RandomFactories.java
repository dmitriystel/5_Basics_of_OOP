package by.introduction.fifth.OOP4.factory;

import java.util.Random;

import by.introduction.fifth.OOP4.entity.Treasure;

public class RandomFactories implements TreasureFactory {
    TreasureFactory[] factories;
    Random r = new Random();

    public RandomFactories(TreasureFactory[]factories){
        this.factories = factories;
    }

    public Treasure create() {
    		
        int num = r.nextInt(factories.length);  
       						   
        return factories[num].create();
    }
}