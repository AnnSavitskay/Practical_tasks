package prak_7;

public class Shepherd extends Dog{
    private int num_herd;

    public Shepherd(String color, String name, int age, int num_herd)
    {
        super(color, name, age);
        this.num_herd = num_herd;
    }

    public int getNum_herd() {
        return num_herd;
    }

    public void setNum_herd(int num_herd) {
        this.num_herd = num_herd;
    }

    @Override
    public String toString()
    {
        return "The Sherperd is " + color + " color, it`s name is " + name + ", it`s age is " + age +
                " " +  man_Age() + ", it quards " + num_herd + " herd";
    }
}
