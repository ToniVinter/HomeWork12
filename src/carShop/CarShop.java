package carShop;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShop {
    private final List<Car> carList;

    public CarShop(List<Car> carList) {
        this.carList = new ArrayList<>(carList);
    }

    public Map<String, Integer> getCars() {
        Map<String, Integer> carsMap = new HashMap<>();
        List<Integer> nr = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            carsMap.putIfAbsent(carList.get(i).getName(), 0);
            carsMap.put(carList.get(i).getName(), carsMap.get(carList.get(i).getName()) + 1);
        }
        return carsMap;
    }

    public Map<String, Integer> getKm() {
        Map<String, Integer> mapOfKM = new HashMap<>();
        for (Car subject : carList) {
            mapOfKM.put(subject.getName(), subject.getKm());
        }
        return mapOfKM;
    }

    public Map<RangeKm, List<String>> listOfCarsInRange(int low, int high) {
        RangeKm range = new RangeKm(low, high);
        Map<RangeKm, List<String>> inRange = new HashMap<>();
        List<String> cars = new ArrayList<>();
        for (Car subject : carList) {
            if (subject.getKm() > range.getLow() && subject.getKm() < range.getHigh()) {
                cars.add(subject.getName());
                inRange.put(range, cars);
            }

        }
        return inRange;
    }
}


