import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

    public static void main(String[] args) {

        arrayListExample();

    }

    public static void arrayListExample() {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("NIVA");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.add(new Car("Toyota"));



        System.out.println("Cars.size "+cars.size());

        System.out.println("Cars.contains(car2) -"+cars.contains(car2));

        Car selectedCar = cars.get(3);
        System.out.println("selectedCar - "+selectedCar.getName()+" - index - "+cars.indexOf(selectedCar));

        int index = cars.indexOf(car3);
        System.out.println("index - "+index);

        Iterator<Car>iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear();
        System.out.println("cars.isEmpty() - "+cars.isEmpty());




    }
}
