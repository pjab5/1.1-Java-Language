package src.Level2;

public class MobilePhone {
    private String brand;
    private String model;
    public MobilePhone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void call(String phone_number){
        System.out.println("Calling "+ phone_number);
    }
}
