package src.Level3;

import java.util.Objects;

public class Basketball extends Article {
    private String titular;
    private String text;
    private String competition;
    private String club;

    public Basketball(String headline, String text, String competition, String club){
        super(headline,text);
        this.competition = competition;
        this.club = club;
    }

    public int getArticlePrice(){
        int price = 250;
        if(Objects.equals(this.competition, "Euroleague")){
            price += 75;
        }
        if(Objects.equals(this.club, "Barça")||Objects.equals(this.club, "Madrid")){
            price += 75;
        }
        return price;
    }

    public int getArticlePunctuation(){
        int punctuation = 4;
        if(Objects.equals(this.competition,"Euroleague")){
            punctuation += 3;
        }
        if(Objects.equals(this.competition, "ACB")){
            punctuation += 2;
        }
        if(Objects.equals(this.club, "Barça")||Objects.equals(this.club, "Madrid")){
            punctuation += 1;
        }
        return punctuation;
    }

}
