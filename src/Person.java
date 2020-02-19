import java.util.*;

public class Person {
    private final String name;
    private final int age;
    private final String colour;


    public Person(String name, int age, String colour) { ;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(colour, person.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour);
    }
}
