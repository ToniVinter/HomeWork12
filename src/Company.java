import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employee;

    public Company(List<Employee> employee) {
        this.employee = new ArrayList<>(employee);
    }

    public List<String> goodSalary(int amount) {
        List<String> persons = new ArrayList<>();
        for (Employee subject : employee) {
            if (subject.getSalary() > amount) {

                persons.add(subject.getName());
            }
        }

        return persons;
    }

    public List<String> goodCompany(String companyName) {
        List<String> persons = new ArrayList<>();
        for (Employee subject : employee) {
            if (subject.getCompany().equals(companyName)) {

                persons.add(subject.getName());
            }
        }

        return persons;
    }

    public String bestCompany(){
        Employee theBestSalary = null;
        int maxSalary = 0;
        for(Employee subject: employee){
            if(maxSalary < subject.getSalary()){
                theBestSalary = subject;
                maxSalary = subject.getSalary();
            }
        }
        return "The best company is: " + theBestSalary.getCompany();
    }


}
