package java_8;

abstract public class Furniture {
    protected int price;
    protected String color;
    protected boolean buy_or_not;

    public Furniture(int price, String color, boolean buy_or_not)
    {
        this.price = price;
        this.color = color;
        this.buy_or_not = buy_or_not;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isBuy_or_not() {
        return buy_or_not;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBuy_or_not(boolean buy_or_not) {
        this.buy_or_not = buy_or_not;
    }

    public String Buy_or_not()
    {
        if(buy_or_not) return "bought";
        else return "not bought";
    }

    abstract public String toString();
}
