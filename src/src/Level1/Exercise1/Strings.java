package src.Level1.Exercise1;

public class Strings extends Instrument{

    public Strings(String name) {
        this.name = name;
        System.out.println("The " + name + "'s price is "+ price + " euros");
    }
    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
