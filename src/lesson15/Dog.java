package lesson15;

public class Dog {
    // Поля
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePuton;

    // Конструктор

    public Dog(String name) {
        this.name = name;
    }


    // Методы
    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isMuzzlePuton = true;
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("Идем гулять!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePuton) {
            System.out.println("Урааааа, идем гулять!");
        } else {
            throw new DogIsNotReadyToWalkException("Собака " + name + " не готова!");
        }
    }


}
