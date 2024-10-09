package src.Level3;

import java.util.Objects;

public class F1 extends Article {
    private String headline;
    private String text;
    private String team;

    public F1(String headline, String text, String team){
        super(headline,text);
        this.team = team;
    }
    public int getArticlePrice(){
        int price = 100;
        if(Objects.equals(this.team, "Ferrari")||Objects.equals(this.team, "Mercedes")){
            price += 50;
        }
        return price;
    }

    public int getArticlePunctuation(){
        int punctuation = 4;
        if(Objects.equals(this.team, "Ferrari")||Objects.equals(this.team, "Mercedes")){
            punctuation += 2;
        }
        return punctuation;
    }
}
