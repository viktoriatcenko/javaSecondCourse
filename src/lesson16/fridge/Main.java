package lesson16.fridge;

public class Main {
    public static void main(String[] args) {
        SmartFridge fridge = new SmartFridge();

        fridge.putProducts("Apple", 5);
        fridge.putProducts("Eggs", 10);
        fridge.putProducts("Milk", 1);
        fridge.putProducts("Carrot", 10);
        fridge.putProducts("Coca-Cola", 3);

        System.out.println();


        fridge.putProducts("Coca-Cola", 1);
        fridge.getProduct("Pear", 1);
        fridge.getProduct("Milk", 1);
        fridge.getProduct("Eggs", 11);

        System.out.println();
    }
}
