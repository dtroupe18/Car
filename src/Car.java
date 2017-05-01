/**
 * Created by Dave on 5/1/17.
 */

import java.util.Scanner;

public class Car {

    // field variables
    private String plate;
    private String color;
    private int seats;
    private int numberOfTires;

    Car(String color, int seats, int numberOfTires) {
        this.color = color;
        this.seats = seats;
        this.numberOfTires = numberOfTires;
    }

    public void setPlate(String p) {
        plate = p;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setSeats(int s) {
        seats = s;
    }

    public void setNumberOfTires(int t) {
        numberOfTires = t;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public String toString() {

        if (plate == null) {
            return "You have a " + getColor() + " car with " + getNumberOfTires() + " tires and " +
                    getSeats() + " seats";
        }
        else {
            return "You have a " + getColor() + " car with " + getNumberOfTires() + " tires and " +
                    getSeats() + " seats and your plate is " + getPlate();
        }
    }
}

class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the color of your car?");
        String color = input.nextLine();

        System.out.println("How many tires does your car have?");
        int tires = input.nextInt();

        System.out.println("How many homies can you fit in your ride?");
        int seats = input.nextInt();

        Car myCar = new Car(color, seats, tires);

        System.out.println(myCar.toString());

        myCar.setPlate("YBC-3G9");

        System.out.println(myCar.toString());
    }
}
