package src.Level3;

public abstract class Article {
    private String headline;
    private String text;
    private int punctuation;
    private int price;

    public Article(String headline, String text){
        this.headline = headline;
        this.text = text;
    }

    public String getHeadline(){
        return this.headline;
    }
    public abstract int getArticlePrice();
    public abstract int getArticlePunctuation();
}
