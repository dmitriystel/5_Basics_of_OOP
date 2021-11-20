package by.introduction.fifth.OOP4.factory;

import java.util.Random;

import by.introduction.fifth.OOP4.entity.Sword;
import by.introduction.fifth.OOP4.entity.Treasure;

public class SwordFactory implements TreasureFactory {	

    public Treasure create() {
        String[] adjective = {"Rapier", "Sabre", "Katana", "Changdao", "Flyssa", "Shinai", "Klewang"};

        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1) ];


        return new Sword(r.nextInt(9000), firstAdjective + " " +  "Sword");
    }
}