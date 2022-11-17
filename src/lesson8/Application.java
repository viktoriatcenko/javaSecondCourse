package lesson8;


public class Application {
    public static void main(String[] args) {
        /**Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы.
         Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы
         собраны в одном классе;

         Формула создания метода-
         1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом
         или классом:
         public - метод/класс будет доступен внутри всех пакетов всего проекта
         (99% случоев используется);
         protected - внутри пакета и его наследникам, то есть дочерним классам,
         расположенных в других пакетах в данном проекте;
         ------------ будет доступен только внутри
         текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);

         -Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");,
         то он не должен быть static;
         static - если метод будет вызываться у тuпа
         String.copyValue0f(char[] data);

         -Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] -
         если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов;
         public static void - если ни чего не возвращает, а просто выполняется,
         например, печать на консоль;

         4 - Название метода: поясняющее его суть, с моленькай буквы;

         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа

         6 - тело метода (то что должно происходить, когда метод вызовут);

         public static void 				printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода			Сигнатура метода
         */

        // Конструкторы и создание объектов классов

        String s1 = new String("");
        Contact viktor = new Contact("Виктор", "fjhgkjdhgkhdkj@mail.ru", "89316251423");
        Contact denis1 = new Contact("Денис", "fjhgkjddkj@mail.ru", "89316251424");
        Contact denis2 = new Contact("Денис", "fjhgkjdhkj@mail.ru", "89316251425");
        Contact alex = new Contact("Александр", "fjhgkjdhgkhdkj12313@mail.ru", "89316251426");
        Contact vasilii = new Contact("Василий", "fjhgkjdhgkhdkj1111@mail.ru", "89316251427");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(viktor);
        phoneBook.addContact(denis1);
        phoneBook.addContact(denis2);
        phoneBook.addContact(alex);
        phoneBook.addContact(vasilii);
        phoneBook.search("Виктор");
        phoneBook.edit("Виктор", "Виталий");
        phoneBook.delete("Виталий");
        System.out.println(phoneBook);
    }

}
