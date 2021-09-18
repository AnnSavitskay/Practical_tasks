package prak_7;

public abstract class Dish {
    protected String matherial;
    protected boolean clean;

    public Dish(String matherial, boolean clean)
    {
        this.matherial = matherial;
        this.clean = clean;
    }

    public String getMatherial() {
        return matherial;
    }

    public boolean isClean() {
        return clean;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    abstract public String toString();

    public String isClean_str()
    {
        if(clean) return "is clean";
        else return "is not clean";
    }
}
