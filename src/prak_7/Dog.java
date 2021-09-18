package prak_7;

public abstract class Dog {
    protected String color;
    protected int age;
    protected String name;

    public Dog(String color, String name, int age)
    {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String man_Age()
    {
        return "in man`s age, dog is " + 7*this.getAge() + " age";
    }

    abstract public String toString();
}
