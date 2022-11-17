package lesson3;

public class Application {

    public static void main(String[] args) {
        /**Арифметические операторы
         +	Складывает значения по обе стороны от оператора
         -	Вычитает правый операнд из левого операнда
         *	Умножает значения по обе стороны от оператора
         /	Оператор деления делит левый операнд на правый операнд
         %	Делит левый операнд на правый операнд и возвращает остаток
         ++	Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --	Декремент - уменьшает значение операнда на 1	х-- постфиксная, --х префиксная*/

        int s1 = 10;
        int s2 = 5;
        int rez = s1 % s2;
        System.out.println(rez);

        s2--;

        int w = 1;

        int x = w++;

        int y = ++w;

        System.out.println(x);
        System.out.println(w);
        System.out.println(y);

        int cash = 1500;

        int priceOfPizza = 230;
        int priceOfGum = 26;
        double priceOfCandy = 2.5;
        int countOfPizza = cash / priceOfPizza;
        System.out.println(countOfPizza);

        double balanceAfterPizza = cash % priceOfPizza;

        System.out.println(balanceAfterPizza);

        int countOfGum = (int) (balanceAfterPizza / priceOfGum);

        System.out.println(countOfGum);

        double balanceAfterGum = balanceAfterPizza % priceOfGum;

        System.out.println(balanceAfterGum);

        int countOfCandy = (int) (balanceAfterGum / priceOfCandy);

        System.out.println(countOfCandy);

        double change = balanceAfterGum % priceOfCandy;

        System.out.println(change);

        int sum1 = 10;
        int sum2 = 0;
        sum2 = sum1 + sum2;  // === sum2 += sum1;
        sum2 += sum1;
        sum2 -= sum1;

        System.out.println(sum2);


        /**Операторы сравнения

         ==	Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным	(A == B) – не верны

         !=	Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным	(A != B) – значение истинна

         >	Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным	(A > B) – не верны

         <	Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным	(A < B) – значение истинна

         >=	Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным	(A >= B) – значение не верны

         <=	Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным	(A <= B) – значение истинна*/

        char a = '@';
        char b = 65;

        boolean c = a != b;

        System.out.println(c);


        /**&&	Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false*/

        boolean a1 = true;
        boolean b1 = false;

        boolean c1 = a1 || b1; // если один из вариантов у нас true - вернется true

        System.out.println(c1);

        boolean c2 = a1 && b1; // если один из вариантов у нас false - вернется false

        System.out.println(c2);

        boolean d1 = (a1 && b1) || (a1 && b1);

        System.out.println(d1);

        /**

         if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else {
         //действие(-я), которые выполняются, если условие истинно;
         }

         */

        int v = 10;

        int ageOfYourChild = 10;

        if (ageOfYourChild > 14) {
            System.out.println("УРААААААААААА, ИДЕМ В КИНО");
        } else if (ageOfYourChild == 14) {
            System.out.println("СОВРУ БИЛЕТЕРУ, ЧТО РЕБЕНКУ УЖЕ 14");
        } else {
            System.out.println("НЕЕЕЕЕЕЕЕЕЕЕТ,СМОТРИМ КОМЕДИЮ ДОМА");
        }

        /**
         switch (ВыражениеДляВыбора) {
         case  (Значение1):
         Код1;
         break;
         case (Значение2):
         Код2;
         break;
         ...
         case (ЗначениеN):
         КодN;
         break;
         default:
         КодВыбораПоУмолчанию;
         break;
         }
         */

        int ball = 1;

        switch (ball) {
            case 5 :
                System.out.println("Отлично");
                break;
            case 4 :
                System.out.println("Хорошо");
                break;
            case 3 :
                System.out.println("Удовлетворительно");
                System.out.println("Учись лучше");
                break;
            case 2 :
                System.out.println("Плохо");
                break;
            default:
                System.out.println("Непонятная оценка");
        }
    }

}
