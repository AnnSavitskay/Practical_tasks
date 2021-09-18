package java_8;

public class Table extends Furniture{
    private String matherial;
    private int how_many_sits;

    public Table(int price, String color, boolean buy_or_not, String matherial, int how_many_sits)
    {
        super(price, color, buy_or_not);
        this.matherial = matherial;
        this.how_many_sits = how_many_sits;
    }

    public String getMatherial() {
        return matherial;
    }

    public int getHow_many_sits() {
        return how_many_sits;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    public void setHow_many_sits(int how_many_sits) {
        this.how_many_sits = how_many_sits;
    }

    public String toString()
    {
        return "The table is made from " + matherial + ", it`s color is " + color + ", it has " + how_many_sits + " seats" +
                ", it costs " + price + ", and it`s " + Buy_or_not();
    }
}
