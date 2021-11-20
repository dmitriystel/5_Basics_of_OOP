package by.introduction.fifth.OOP5.entity;

import java.util.Objects;

import by.introduction.fifth.OOP5.factories.BoxFactory;
import by.introduction.fifth.OOP5.factories.CandyFactory;
import by.introduction.fifth.OOP5.factories.ChocolateFactory;
import by.introduction.fifth.OOP5.factories.SweetsFactory;
import by.introduction.fifth.OOP5.factories.WrappingFactory;
import by.introduction.fifth.OOP5.factories.WrappingPaperFactory;

public class Gift {
	
    private Wrapping wrapping;
    private Sweets sweets;
    private int price;

    public Gift() {
    }
    
    public Gift(Wrapping wrapping, Sweets sweets, int price) {
		super();
		this.wrapping = wrapping;
		this.sweets = sweets;
		this.price = price;
	}

	public int getPrice() {
        return price;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    public Sweets getSweets() {
        return sweets;
    }

    public void setSweets(Sweets sweets) {
        this.sweets = sweets;
    }


    public void createCandies(String typeOfSweets, String sweetName, int sweetPrice, String sweetShape,
                              String sweetTaste) {

        SweetsFactory sweetsFactory = createSweets(typeOfSweets);
        this.sweets = sweetsFactory.createSweets(sweetName, sweetPrice, sweetShape, sweetTaste);
    }

    public void createWrapping(String wrappingType, String wrapColor, int wrapPrice) {
        WrappingFactory wrappingFactory = createWrapping(wrappingType);
        this.wrapping = wrappingFactory.createWrapping(wrapColor, wrapPrice);
    }

    SweetsFactory createSweets(String sweetsType) {
        if (sweetsType.equalsIgnoreCase("Candy")) {
            return new CandyFactory();
        } else if (sweetsType.equalsIgnoreCase("Chocolate")) {
            return new ChocolateFactory();
        }
        return null;
    }

    WrappingFactory createWrapping(String wrappingType) {
        if (wrappingType.equalsIgnoreCase("Box")) {
            return new BoxFactory();
        } else if (wrappingType.equalsIgnoreCase("WrappingPaper")) {
            return new WrappingPaperFactory();
        }
        return null;
    }

    public void calculatePrice(){
        this.price = sweets.getPrice()+wrapping.getPrice();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(wrapping, gift.wrapping) && Objects.equals(sweets, gift.sweets);
    }

    public int hashCode() {
        return Objects.hash(wrapping, sweets);
    }

    public String toString() {
        return "Your gift: \n" +
                wrapping + '.' +
                "\n" + sweets +
                ".\nPrice = " + price + '.';
    }
}
