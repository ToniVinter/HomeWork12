import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private final int salary;
    private final String company;
    private final List<Person> persons = new ArrayList<>();

    public Employee(String name, int age, String colour, int salary, String company) {
        super(name, age, colour);
        this.salary = salary;
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }


    }


