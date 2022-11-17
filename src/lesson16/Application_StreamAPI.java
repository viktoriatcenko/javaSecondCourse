package lesson16;

import lesson16.stream_api.OldUtil;
import lesson16.stream_api.Specialist;
import lesson16.stream_api.StreamUtil;

import java.util.ArrayList;
import java.util.List;

public class Application_StreamAPI {
    public static void main(String[] args) {
        Specialist spec1 = new Specialist("Ivanov Ivan", 10000, Specialty.BACKEND_DEVELOPER);
        Specialist spec2 = new Specialist("Petrov Petr", 9500, Specialty.FRONTED_DEVELOPER);
        Specialist spec3 = new Specialist("Vasiliev Vasiliy", 9000, Specialty.FRONTED_DEVELOPER);
        Specialist spec4 = new Specialist("Vladimirov Vladimir", 6500, Specialty.DEVOPS);
        Specialist spec5 = new Specialist("Alexandrov Alexandr", 12000, Specialty.BACKEND_DEVELOPER);

        List<Specialist> specialists = new ArrayList<>();
        specialists.add(spec1);
        specialists.add(spec2);
        specialists.add(spec3);
        specialists.add(spec4);
        specialists.add(spec5);

        Specialist specWithMinSalry1 = OldUtil.findWithMinSalary(specialists);
        Specialist specWithMinSalry2 = StreamUtil.findWithMinSalary(specialists);

//        StreamUtil.printCollection(StreamUtil.filterBySpecialty(specialists, Specialty.BACKEND_DEVELOPER));
//        StreamUtil.printCollection(StreamUtil.sortCollection(specialists));

//        OldUtil.printSpeciaist(specWithMinSalry1);
//        OldUtil.printSpeciaist(specWithMinSalry2);

//        System.out.println(StreamUtil.matchAllDevops(specialists));
//        System.out.println(StreamUtil.matchANyDevops(specialists));
        System.out.println(StreamUtil.matchAllSalaryMoreThan(specialists, 6000));

    }
}
