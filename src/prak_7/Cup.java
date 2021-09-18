package prak_7;

public class Cup extends Dish{
    private int size;
    private boolean heat_resistant;

    public Cup(String matherial, boolean clean, int size, boolean heat_resistant)
    {
        super(matherial, clean);
        this.size = size;
        this.heat_resistant = heat_resistant;
    }

    public int getSize() {
        return size;
    }

    public boolean isHeat_resistant() {
        return heat_resistant;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHeat_resistant(boolean heat_resistant) {
        this.heat_resistant = heat_resistant;
    }

    @Override
    public String toString()
    {
        return "The cup is made from " + matherial + ", her size is " + size + "ml, it " + isClean_str() +
                "and it " + this.Heat_resistant();
    }

    public String Heat_resistant() {
        if (heat_resistant) return "is heat resistant";
        else return "is not heat resistant";
    }
}
