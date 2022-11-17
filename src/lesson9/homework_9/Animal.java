package lesson9.homework_9;

public class Animal {
    // Поля

    private String name;
    private String food;
    private String location;

    // Конструктор



    // Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void eat() {
        System.out.println(getName() + " ест...");

    }

    public void makeNoise() {
        System.out.println(getName() + " кричит...");

    }

    public void sleep() {
        System.out.println(getName() + " спит...");
    }


}
