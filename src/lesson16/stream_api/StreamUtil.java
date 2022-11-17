package lesson16.stream_api;

import lesson16.Specialty;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtil {
    public static Specialist findWithMinSalary(List<Specialist> list) {
        return list.stream()
                .min(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    public static Specialist findWithMaxSalary(List<Specialist> list) {
        return list.stream()
                .max(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    // поиск по спецальности
    public static List<Specialist> filterBySpecialty(List<Specialist> list, Specialty specialty) {
        return list.stream()
                .filter(x -> x.getSpecialty().equals(specialty))
                .collect(Collectors.toList());
    }

    public static void printCollection(List<Specialist> list) {
        list.forEach(specialist -> System.out.println(specialist.getName() + " "
                + specialist.getSalary() + " " + specialist.getSpecialty()));
    }

    public static List<Specialist> sortCollection(List<Specialist> list) {
        return list.stream()
                .sorted(Comparator.comparing(Specialist::getName))
                .collect(Collectors.toList());
    }

    public static boolean matchAllDevops (List<Specialist> list) {
        return list.stream()
                .allMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVOPS));
    }

    public static boolean matchANyDevops (List<Specialist> list) {
        return list.stream()
                .anyMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVOPS));
    }

    public static boolean matchAllSalaryMoreThan(List<Specialist> list, Integer count) {
        return list.stream()
                .allMatch(specialist -> specialist.getSalary().compareTo(count) > 0);
    }

}
