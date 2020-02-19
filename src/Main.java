import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> classRoom = new HashMap<>();
//        classRoom.put(5,"Ana");
//        classRoom.put(6,"Vasile");
//        classRoom.put(7,"Popescu");
//        Students students = new Students(classRoom);
//        students.getHighesGrade();
        List<Comunity> person = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ana",4,"Verde"));
        personList.add(new Person("Adi",5,"Verde"));
        personList.add(new Person("Popescu",6,"Rosu"));
        personList.add(new Person("Mirela",7,"Verde"));

        person.add(new Comunity(personList));

        for (Comunity subject:person) {
            System.out.println(subject.getColourHair());
        }

    }
}
