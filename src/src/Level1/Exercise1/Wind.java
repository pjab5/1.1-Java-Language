package src.Level1.Exercise1;

public class Wind extends Instrument{

    public Wind(String name) {
        this.name = name;
        System.out.println("The " + name + "'s price is "+ price + " euros");
    }
    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}
