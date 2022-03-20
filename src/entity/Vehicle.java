package entity;

public abstract class Vehicle {

    public String name;
    public int wheel;
    public String color;
    public boolean swim;

    public Vehicle(String name, int wheel, String color, boolean swim) {
        this.name = name;
        this.wheel = wheel;
        this.color = color;
        this.swim = swim;
    }

    public String toSwim() {
        return "SWIM!";
    }
    public abstract void printInfo();
}
