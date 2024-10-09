package src.Level1.Exercise1;

public class Percussion extends Instrument{
    public Percussion(String name) {
        this.name = name;
        System.out.println("The " + name + "'s price is "+ Instrument.price + " euros" );
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}

