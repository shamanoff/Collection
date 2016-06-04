import java.util.ArrayDeque;
import java.util.Deque;

public class QueueMain {
    public static void main(String[] args) {
        //Queue<Car> cars = new ArrayBlockingQueue<Car>(5);
       Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");
        Car car5 = new Car("Nissan");
        Car car6 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println("lifoQueue.element() = "+cars.element());
        //System.out.println("lifoQueue.element() = "+cars.remove());

        // Queue lifoQueue = Collections.asLifoQueue(cars);

        //System.out.println("lifoQueue.element() = "+lifoQueue.element());

    }
}
