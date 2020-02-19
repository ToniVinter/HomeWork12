import java.util.*;

public class Comunity {
    private final List<Person> persons;
    Map<String, Integer> personAge = new HashMap<>();

    Comunity(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
    }

    public List<String> getListOfNames() {
        List<String> nameOfPersons = new ArrayList<>();
        for (Person person : persons) {
            nameOfPersons.add(person.getName());
        }
        return nameOfPersons;
    }

    public Map<String, Integer> getPersonsAge() {

        for (Person person : persons) {
            personAge.put(person.getName(), person.getAge());
            System.out.println(person.getName());
        }
        return personAge;
    }

    public Map<String, Integer> getOlderPersons(int age) {
        Map<String, Integer> olderPersons = new HashMap<>();
        for (String personName : personAge.keySet()) {
            if (personAge.get(personName) > age) {
                olderPersons.put(personName, personAge.get(personName));
            }
        }
        return olderPersons;
    }

    public Map<String, List<String>> getColourHair() {
        // Map<colour,List<name>>
        Map<String, List<String>> hairColourPersons = new HashMap<>();

        for (Person personTemp : persons) {
            List<String> name = hairColourPersons.get(personTemp.getColour());

            if (name == null) {
                name = new ArrayList<>();
                hairColourPersons.put(personTemp.getColour(), name);
            }
            name.add(personTemp.getName());
        }
        return hairColourPersons;
    }

}