package src.Level1.Exercise2;

public class Car {
    private static final String brand = "Audi";
    private static String model;
    private final double power;

    public Car(String model, double power){
        Car.model = model;
        this.power = power;
        System.out.println("Model: " + Car.model + ", Brand: "+ Car.brand + ", Power: " + this.power);
    }
    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }
    public static void brake(){
        System.out.println("The vehicle is braking");
    }

}
