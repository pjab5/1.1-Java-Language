package src.Level3;

import java.util.Objects;

public class Football extends Article {
    private String headline;
    private String text;
    private String competition;
    private String club;
    private String player;

    public Football(String headline, String text, String competition, String club, String player){
        super(headline,text);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public int getArticlePrice(){
        int price = 300;
        if(Objects.equals(this.competition, "Champions League")){
            price += 100;
        }
        if(Objects.equals(this.club, "Barça")||Objects.equals(this.club, "Madrid")){
            price += 100;
        }
        if(Objects.equals(this.player, "Ferran Torres")||Objects.equals(this.player, "Benzema")){
            price += 50;
        }
        return price;
    }

    public int getArticlePunctuation(){
        int punctuation = 5;
        if(Objects.equals(this.competition, "Champions League")){
            punctuation += 3;
        }
        if(Objects.equals(this.club, "Barça")||Objects.equals(this.club, "Madrid")){
            punctuation += 1;
        }
        if(Objects.equals(this.player, "Ferran Torres")||Objects.equals(this.player, "Benzema")){
            punctuation += 1;
        }
        return punctuation;
    }
}
