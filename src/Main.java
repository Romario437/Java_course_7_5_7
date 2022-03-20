import entity.Boat;
import entity.Car;
import entity.Speed;

public class Main {

    static final String maxSpeed = "*********";
    static final String maxSpeed1 = "*****";

    public static void main(String[] args) {

        //Скорость
        Speed speed = new Speed();
        speed.setS1(10);
        speed.setS2(35);


        //Это у нас машина
        Car car = new Car("NISSAN", 4, "BLACK", false);

        car.printInfo();
        System.out.println("\nSpeed:  " + speed.getS2()+ " km/h");//GET скорость машины
        System.out.println("Limit:  " + maxSpeed);
        System.out.println("Car:    " + car.name + "\nWheels: "
                + car.wheel + "\nColor:  " + car.color + "\nSwim:  " + car.toSwim());


        //Это у нас лодка
        Boat boat = new Boat("JET", 0, "NAVY", true);

        boat.printInfo();
        System.out.println("\nSpeed:  " + speed.getS1() + " knots");//GET скорость лодки
        System.out.println("Limit:  " + maxSpeed1);
        System.out.println("Boat:   " + boat.name + "\nWheels: "
                + boat.wheel + "\nColor:  " + boat.color + "\nSwim:  " + boat.toSwim());
    }

}
