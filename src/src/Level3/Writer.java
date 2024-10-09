package src.Level3;

import java.util.ArrayList;
import java.util.List;

public class Writer {
    private String name;
    private final String DNI;
    private static double salary;
    private List<Article> articles;

    public Writer(String name, String DNI){
        this.name = name;
        this.DNI = DNI;
        this.articles = new ArrayList<>();
    }

    public void addArticle(Article article){
        articles.add(article);
    }

    public void deleteArticle(Article article){
        articles.remove(article);
    }

    public List<String> getArticles() {
            List<String> headlines = new ArrayList<>();
            for (Article article : articles){
                headlines.add(article.getHeadline());
            }
        return headlines;
    }

    public String getName() {
        return name;
    }
}
