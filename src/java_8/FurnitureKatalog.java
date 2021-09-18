package java_8;

import java.util.Scanner;

public class FurnitureKatalog {
    private FurnitureShop furnitureShop;

    public FurnitureKatalog()
    {
        furnitureShop = new FurnitureShop(new Furniture[]{new Table(1500, "red", false, "wood", 4), new Chair
                (500, "black", false, "office", false)});
        furnitureShop.addFurniture(new Closet(3000, "brown", false, "dish"));
        furnitureShop.addFurniture(new Table(2000, "white", false, "wood", 5));
        furnitureShop.addFurniture(new Chair(1000, "white", false, "kitchen", true));
        furnitureShop.addFurniture(new Table(5000, "grey", false, "wood", 7));
        furnitureShop.addFurniture(new Closet(5500, "black", false, "books"));
    }

    public void what_to_buy()
    {
        System.out.println("If you want to buy something enter the number of it< if you want to exit enter -1");
        Scanner scan = new Scanner(System.in);
        System.out.println(furnitureShop);
        for(;;)
        {
            System.out.print("Enter your choice -> ");
            int x = scan.nextInt();
            if(x != -1)
            {
                furnitureShop.to_Buy(x);
                System.out.println(furnitureShop);
            }
            else break;
        }
    }
}
