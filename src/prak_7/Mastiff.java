package prak_7;

public class Mastiff extends Dog{
    private String kind_of_mastiff;

    public Mastiff(String color, String name, int age, String kind_of_mastiff)
    {
        super(color, name, age);
        this.kind_of_mastiff = kind_of_mastiff;
    }

    public String getKind_of_mastiff() {
        return kind_of_mastiff;
    }

    public void setKind_of_mastiff(String kind_of_mastiff) {
        this.kind_of_mastiff = kind_of_mastiff;
    }

    @Override
    public String toString()
    {
        return "The mastiff is " + kind_of_mastiff + ", it`s color is " + color + ", it`s age is " + age +
                " " + man_Age() + ", it`s name is " + name;
    }
}
