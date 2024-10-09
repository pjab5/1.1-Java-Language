package src.Level3;

import java.util.Objects;

public class Tennis extends Article {
    private String titular;
    private String text;
    private String competition;
    private String player;

    public Tennis(String headline, String text, String competition, String player){
        super(headline,text);
        this.competition = competition;
        this.player = player;
    }
    public int getArticlePrice(){
        int price = 150;
        if(Objects.equals(this.player, "Federer")||Objects.equals(this.player, "Nadal")||Objects.equals(this.player, "Djokovic")){
            price += 100;
        }
        return price;
    }

    public int getArticlePunctuation(){
        int punctuation = 4;
        if(Objects.equals(this.player, "Federer")||Objects.equals(this.player, "Nadal")||Objects.equals(this.player, "Djokovic")){
            punctuation += 3;
        }
        return punctuation;
    }
}
