public class Car implements Comparable<Car>{

    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getYear() != car.getYear()) return false;
        return getName().equals(car.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getYear();
        return result;
    }


    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
