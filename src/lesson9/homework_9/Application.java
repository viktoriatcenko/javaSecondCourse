package lesson9.homework_9;

public class Application {
    public static void main(String[] args) {
        /**Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
         Класс Animal содержит переменные food, location и методы makeNoise, eat,
         sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
         Dog, Cat, Horse переопределяют методы makeNoise, eat.
         Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
         Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
         Пусть этот метод распечатывает food и location пришедшего на прием животного.
         В методе main создайте массив типа Animal, в который запишите животных всех имеющихся
         у вас типов. В цикле отправляйте их на прием к ветеринару.*/

        Dog dog = new Dog();
        dog.setName("Beethoven");
        dog.setFood("Bone");
        dog.setLocation("CountryHouse");
        dog.setCanFindDrugs(true);

        Cat cat = new Cat();
        cat.setFood("Fish");
        cat.setName("Barsik");
        cat.setLocation("Home");
        cat.setCanHuntToRats(false);

        Horse horse = new Horse();
        horse.setFood("Hay");
        horse.setName("Сахарок");
        horse.setLocation("Field");
        horse.setColor("Red");

        Animal [] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;

        Veterienar veterienar = new Veterienar();
        for (Animal a: animals) {
            veterienar.treatAnimal(a);
        }

    }


}
