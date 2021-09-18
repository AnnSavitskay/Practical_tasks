package prak_7;

public class Plate extends Dish {
    private boolean deep;
    private String food;

    public Plate(String mathreial, boolean clean, boolean deep, String food)
    {
        super(mathreial, clean);
        this.deep = deep;
        this.food = food;
    }

    public boolean isDeep() {
        return deep;
    }

    public String getFood() {
        return food;
    }

    public void setDeep(boolean deep) {
        this.deep = deep;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String Deep()
    {
        if(deep) return "is deep";
        else return "is not deep";
    }

    @Override
    public String toString()
    {
        return "The dish is for the " + food + " and " + this.Deep() + ", it is made from " + matherial +
                "and " + isClean_str();
    }
}
