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
        List<Person> person = new ArrayList<>();
        person.add(new Person("Ana",3,"Verde"));
        person.add(new Person("Adi",4,"Verde"));
        person.add(new Person("Popescu",5,"Verde"));
//        System.out.println(person.toString());

        for (Person temp : person) {
            System.out.println(temp.getColourHair(person));

        }
    }
}
