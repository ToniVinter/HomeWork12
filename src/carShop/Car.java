package carShop;

import java.util.Objects;

public class Car {
    private final String name;
    private final int age;
    private final int km;
    private final int price;

    public Car(String name, int age, int km, int price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                km == car.km &&
                price == car.price &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, km, price);
    }
}
