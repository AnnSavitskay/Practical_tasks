package prak_7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("porcelain", true, false, "meat");
        Cup cup = new Cup("crystal", false, 350, false);
        Shepherd shepherd = new Shepherd("brown", "Sharik", 4, 20);
        Mastiff mastiff = new Mastiff("black", "Murzik", 6, "english");

        System.out.println(plate);
        System.out.println(cup);
        System.out.println(shepherd);
        System.out.println(mastiff);

        cup.setClean(true);
        shepherd.setAge(10);

        System.out.println(cup);
        System.out.println(shepherd);
    }
}
