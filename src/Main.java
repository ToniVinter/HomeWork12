import carShop.Car;
import carShop.CarShop;
import carShop.RangeKm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> classRoom = new HashMap<>();
//        classRoom.put(5,"Ana");
//        classRoom.put(6,"Vasile");
//        classRoom.put(7,"Popescu");
//        Students students = new Students(classRoom);
//        students.getHighesGrade();
        List<Comunity> person = new ArrayList<>();
        List<Employee> personList = new ArrayList<>();
        personList.add(new Employee("Ana", 4, "Verde", 140, "A"));
        personList.add(new Employee("Adi", 5, "Verde", 130, "B"));
        personList.add(new Employee("Popescu", 6, "Rosu", 10000, "A"));
        personList.add(new Employee("Mirela", 7, "Verde", 1000, "D"));
        Company company = new Company(personList);
//        person.add(new Comunity(personList));

//
//        System.out.println(company.goodSalary(100));
//        System.out.println(company.bestCompany());
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 144, 16, 17));
        cars.add(new Car("Passat", 144, 16, 17));
        cars.add(new Car("Audi", 144, 196, 17));
        CarShop carShop = new CarShop(cars);

        System.out.println(carShop.getCars());

        System.out.println(carShop.listOfCarsInRange(100,1000));
    }
}
