package lesson13;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        long startPoint = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!");
        }

        long endPoint = System.currentTimeMillis();
        long result = endPoint - startPoint;

        System.out.println("Печать " + a + " кол-ва раз заняла у нас " + result);

        People son = new People("Вася", 12);
        String res = son.getAge() < 16 ? "Нет, на фильм нельзя" : "Проходи в кино";

        System.out.println(res);

        if (son.getAge() < 16) {
            System.out.println("Нет, на фильм нельзя");
        } else {
            System.out.println("Проходи в кино");
        }



    }
}
