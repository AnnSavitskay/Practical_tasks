package java_8;

public class Closet extends Furniture{
    private String for_what;

    public Closet(int price, String color, boolean buy_or_not, String for_what)
    {
        super(price, color, buy_or_not);
        this.for_what = for_what;
    }

    public String getFor_what() {
        return for_what;
    }

    public void setFor_what(String for_what) {
        this.for_what = for_what;
    }

    public String toString()
    {
        return "The closet is for " + for_what + ", it`s color is " + color + ", it`s price is " + price +
                ", it is " + Buy_or_not();
    }
}
