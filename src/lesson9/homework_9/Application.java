package lesson9.homework_9;

public class Application {
    public static void main(String[] args) {
        /**������� ����� Animal � ����������� ��� ������ Dog, Cat, Horse.
         ����� Animal �������� ���������� food, location � ������ makeNoise, eat,
         sleep. ����� makeNoise, ��������, ����� �������� �� ������� "�����-�� �������� ����".
         Dog, Cat, Horse �������������� ������ makeNoise, eat.
         �������� ���������� � ������ Dog, Cat, Horse, ��������������� ������ ���� ��������.
         �������� ����� ���������, � ������� ���������� ����� void treatAnimal(Animal animal).
         ����� ���� ����� ������������� food � location ���������� �� ����� ���������.
         � ������ main �������� ������ ���� Animal, � ������� �������� �������� ���� ���������
         � ��� �����. � ����� ����������� �� �� ����� � ����������.*/

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
        horse.setName("�������");
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
