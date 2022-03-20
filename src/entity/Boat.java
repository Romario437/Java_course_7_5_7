package entity;

public class Boat extends Vehicle{


    public Boat(String name, int wheel, String color, boolean swim) {
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
            System.out.println("\n\nThis is BOAT! ");

        }
}
