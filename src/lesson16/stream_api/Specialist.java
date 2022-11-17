package lesson16.stream_api;

import lesson16.Specialty;

public class Specialist {
    // ����
    private String name;
    private Integer salary;
    private Specialty specialty;

    // �����������

    public Specialist(String name, Integer salary, Specialty specialty) {
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;
    }


    //������


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
