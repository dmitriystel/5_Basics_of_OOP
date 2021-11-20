package by.introduction.fifth.OOP4.factory;

import java.util.Random;

import by.introduction.fifth.OOP4.entity.Statuette;
import by.introduction.fifth.OOP4.entity.Treasure;

public class StatuetteFactory implements TreasureFactory {

    public Treasure create() {
        String[] adjective = {"stone", "gold", "wood", "bronze ", "faience", "porcelain", "clay"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Statuette(r.nextInt(9000), firstAdjective + " Statuette");
    }
}