import java.util.*;

public class ComparatorMain {

    private static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 1999);
        Car car2 = new Car("NiVA", 2004);
        Car car3 = new Car("Opel", 2013);
        Car car4 = new Car("Nissan", 1990);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
//Comparable sort
        System.out.print("Comparable");
        Collections.sort(cars);
        print(cars);
        System.out.println("----------");

        System.out.println("cars.get(2).getName() - " + cars.get(2).getName());
        System.out.println("----------");

//Comparator work

        Collections.sort(cars, new CarYearComparator());
        System.out.print("CarYearComparator");
        print(cars);
        System.out.println("----------");
        Collections.sort(cars, new CarNameComparator());
        System.out.print("CarNameComparator");
        print(cars);
        System.out.println("----------");
//TreeSet
        CarNameComparator carNameComparator = new CarNameComparator();

        TreeSet<Car> carsSet = new TreeSet<>(carNameComparator);
        carsSet.add(car1);
        carsSet.add(car2);
        carsSet.add(car3);
        carsSet.add(car4);
        System.out.print("TreeSet carsSet");
        print(carsSet);
    }

    public static void print(Collection collection) {
        System.out.println();
        Iterator<Car>iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName()+" , "+car.getYear());
        }
    }
}
