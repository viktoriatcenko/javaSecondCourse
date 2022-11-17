package lesson7;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        // Задача 1. Написать таймер.

//        for (int days = 0; days < 365 ; days++) { // Days
//            for (int hour = 0; hour < 24 ; hour++) { // Hours
//                for (int min = 0; min < 60 ; min++) { // Minutes
//                    for (int sec = 0; sec < 60 ; sec++) { // Секунды
//                        Thread.sleep(1000);
//                        // %d - числовые типы, %s - строковые типы, \n - перенос каретки (абзац)
//                        String name = "Виктор, ";
//                        System.out.printf("%s, Прошло дней %d час(ов) %d, минут %d, секунд %d", name, days, hour, min, sec);
//                        System.out.println();
//                        //System.out.println("Прошло дней " + days + ", час(ов)" + hour + ", минут " + min + ", секунд " + sec);
//                    }
//                }
//            }
//        }

        // Двумерные массивы
        //int [][] = new int[3][];
        int [][] numbers = {{5, 5, 8},
                            {6, 7, 8, 9, 10},
                            {1, 0}};
        System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.print(numbers[0][2]);
        System.out.println();

        System.out.print(numbers[1][0]);
        System.out.print(numbers[1][1]);
        System.out.print(numbers[1][2]);
        System.out.println();

        System.out.print(numbers[2][0]);
        System.out.print(numbers[2][1]);
//        System.out.print(numbers[2][2]);

        System.out.println();
//        int [][] numbers = {{5, 5, 8},
//                {6, 7, 8},
//                {1, 0, 8}};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задача 2. Наполнение двумерного массива цифрами от 10 и дальше + 5");
        int [][] numbers2 = new int[5][5];
        int start = 10;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = start;
                start += 5;
            }
            System.out.println();
        }

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задача 3. Распечатать двумерный массив  по диагонали.");

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(numbers2[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
