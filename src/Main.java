import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("C101", "Toyota", 1500, 3, 600);
        Car car2 = new Car("C102", "Honda", 1800, 4, 700);

        Motorcycle motorcycle1 = new Motorcycle("M201", "Yamaha", 800, 2, 150);
        Motorcycle motorcycle2 = new Motorcycle("M202", "Suzuki", 900, 5, 200);

        Vehicle[] vehicles = {car1, car2, motorcycle1, motorcycle2};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("--------------------------");
        }
    }
}