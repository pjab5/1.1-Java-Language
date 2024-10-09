package src.Level2;

public class Smartphone extends MobilePhone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
        System.out.println("Model: " + model + ", Brand: "+ brand);
    }
    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    public void alarm(){
        System.out.println("The alarm is ringing");
    }
}
