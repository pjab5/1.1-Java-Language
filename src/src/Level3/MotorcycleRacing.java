package src.Level3;

import java.util.Objects;

public class MotorcycleRacing extends Article {
    private String headline;
    private String text;
    private String team;

    public MotorcycleRacing(String headline, String text, String team){
        super(headline,text);
        this.team = team;
    }

    public int getArticlePrice(){
        int price = 100;
        if(Objects.equals(this.team, "Honda")||Objects.equals(this.team, "Yamaha")){
            price += 50;
        }
        return price;
    }

    public int getArticlePunctuation(){
        int punctuation = 3;
        if(Objects.equals(this.team, "Honda")||Objects.equals(this.team, "Yamaha")){
            punctuation += 3;
        }
        return punctuation;
    }
}
