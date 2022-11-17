package lesson9.homework_9;

public class Veterienar {

    public void treatAnimal(Animal animal) {
        System.out.println(" Зовут " + animal.getName() +
                " Живет в " + animal.getLocation() + " Ест " + animal.getFood());
    }
}
