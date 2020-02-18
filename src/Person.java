import java.util.*;

public class Person {
    private final List<Person> persons = new ArrayList<>();
    private final String name;
    private final int age;
    private final String colour;
    Map<String, Integer> personAge = new HashMap<>();

    public Person(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getColour(){
        return colour;
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
    public Map<String,List<String>> getColourHair(List<Person> person){
        // Map<colour,List<name>>
        Map<String,List<String>> hairColourPersons = new HashMap<>();

        for (Person personTemp: person ){
            List<String> name = hairColourPersons.get(personTemp.getColour());

            if(name == null){
                name = new ArrayList<>();
                hairColourPersons.put(personTemp.getColour(),name);
            }
            name.add(personTemp.getName());
        }
        return hairColourPersons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(persons, person.persons) &&
                Objects.equals(name, person.name) &&
                Objects.equals(colour, person.colour) &&
                Objects.equals(personAge, person.personAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons, name, age, colour, personAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "persons=" + persons +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
