package lesson16.fridge;

import java.util.HashMap;

public class SmartFridge {
    // fields
    private HashMap<String, Integer> products = new HashMap<>();

    // constructor


    // methods
    public void putProducts(String product, int value) {
        // if this product already in products
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        }
        //if this product is not yet in products
        else {
            products.put(product, value);
        }
    }

    public void getProduct(String product, int value) {
        // if this product is not present in fridge
        if (!products.containsKey(product)) {
            System.out.println("������ �������� � ��� ���");
            return;
        }

        // if this product is enough in our fridge
        if (products.get(product) == value) {
            System.out.println("�������� " + product + " ����������");
            products.remove(product);
            return;
        }


        // if this product is not enough in our fridge
        if (products.get(product) < value) {
            System.out.println("�������� " + product + " ������������, ����� ��� ���, ��� ���� " + products.get(product) );
            products.remove(product);
            return;
        }

    }

}
