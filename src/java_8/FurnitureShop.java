package java_8;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureshop;
    private int size;

    public FurnitureShop(){}
    public FurnitureShop(Furniture[] furnitureshop)
    {
        this.furnitureshop = new ArrayList<Furniture>();
        for (int i = 0; i < furnitureshop.length; i++)
        {
            this.furnitureshop.add(furnitureshop[i]);
        }
        this.size = furnitureshop.length;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Furniture> getFurnitureshop() {
        return furnitureshop;
    }

    public void addFurniture(Furniture furniture)
    {
        furnitureshop.add(furniture);
        this.size++;
    }

    public void addMuchFurniture(Furniture[] furniture)
    {
        for(int i = 0; i < furniture.length; i++) {
            this.furnitureshop.add(furniture[i]);
        }

        this.size = furniture.length;
    }

    public void to_Buy(int x)
    {
        furnitureshop.get(x).setBuy_or_not(true);
    }

    public String toString()
    {
        String str = "";
        for(int i = 0; i < furnitureshop.size(); i++)
        {
            str += "Number is " + i + " " + furnitureshop.get(i).toString() + "\n";
        }
        return str;
    }
}
