import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        linkedListExample();
    }

    public static void linkedListExample() {

        LinkedList<Car> cars = new LinkedList<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("NIVA");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.addLast(car1);



        Iterator<Car>iterator=cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        System.out.println(cars.contains(car3));


    }
}
