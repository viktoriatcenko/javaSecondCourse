package lesson2;

public class Application {
    public static void main(String[] args) {

        System.out.println("------------------------Целочисленные типы----------------------");

        System.out.println("Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр треугольнника");
        byte sideA = 60;
        byte sideB = 45;
        byte sideC = 17;

        int perimeter = sideA + sideB + sideC;

        System.out.println("Результат задачи: " + perimeter);

        System.out.println("\n");

        System.out.println("Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров" +
                " в глубину." +
                "А потом вернулся и закопал еще на 2 метра глубже."
                + "\n" +
                "На сколько метров Коля закопал свой дневник?");

        byte deep = 127;
        byte additionalDeep = 2;
        byte result = (byte) (deep + additionalDeep);

        System.out.println("Результат: " + result);

        System.out.println("Задача 5. Дано: Есть 10, 3 и метод научного тыка." +
                " Найти длину после запятой float и double");
        int sample = 10;
        float dividibleFloat = 3;
        double dividibleDouble = 3;
        float resultFloat = sample / dividibleFloat;
        double resultDouble = sample / dividibleDouble;

        System.out.println("Результат float " + resultFloat);
        System.out.println("Результат double " + resultDouble);
        char s = 115;
        System.out.println(s);
        String result5 = "Задача 6. Дано: 10 красных и 5 зеленых яблок.";

        System.out.println(result5 +
                " Вопрос: Верно ли утверждение, что красных яблок больше?");
        int redApple = 10;
        int greenApple = 5;
        boolean result2 = redApple < greenApple;
        System.out.println();

        String w = "5";
        int q = Integer.parseInt(w);
        System.out.println(q);
    }
}
