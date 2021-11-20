package by.introduction.fifth.OOP4.factory;

import java.util.Random;

import by.introduction.fifth.OOP4.entity.Necklace;
import by.introduction.fifth.OOP4.entity.Treasure;

public class NecklaceFactory implements TreasureFactory {	

    public Treasure create() {
        String[] adjective = {"pendant", "choker", "collar", "charms", "opera", "matinee", "locket"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Necklace(r.nextInt(7000), firstAdjective + " Necklace");
    }
}
