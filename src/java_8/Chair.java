package java_8;

public class Chair extends Furniture{
    private String type_of_chair;
    private boolean soft_or_not;

    public Chair(int price, String color, boolean buy_or_not, String type_of_chair, boolean soft_or_not)
    {
        super(price, color, buy_or_not);
        this.type_of_chair= type_of_chair;
        this.soft_or_not = soft_or_not;
    }

    public String getType_of_chair() {
        return type_of_chair;
    }

    public boolean isSoft_or_not() {
        return soft_or_not;
    }

    public void setType_of_chair(String type_of_chair) {
        this.type_of_chair = type_of_chair;
    }

    public void setSoft_or_not(boolean soft_or_not) {
        this.soft_or_not = soft_or_not;
    }

    public String Soft_or_not()
    {
        if(soft_or_not) return "is soft";
        else return "is not soft";
    }

    public String toString()
    {
        return "The chair is " + type_of_chair + ", it`s " + color + " color, it " + Soft_or_not() + ", it`s price is " +
        + price + ", and it is " + Buy_or_not();
    }
}
