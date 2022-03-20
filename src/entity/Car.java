package entity;

public class Car extends Vehicle{

    public Car(String name, int wheel, String color, boolean swim) {
        super(name, wheel, color, swim);
    }

        @Override
        public String toSwim() {
            if (swim) {
                return "SWIM";
            } else return "NO SWIM";
        }

        @Override
        public void printInfo() {
            System.out.println("This is CAR!");
        }
}
