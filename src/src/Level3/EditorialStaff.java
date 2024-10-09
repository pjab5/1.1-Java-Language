package src.Level3;

import java.util.List;
import java.util.Objects;

public class EditorialStaff {
    private List<Writer> writers;
    private List<Article> articles;
    public EditorialStaff(List<Writer> writers, List<Article> articles){
        this.writers = writers;
        this.articles = articles;
    }

    public void AddWriter(Writer writer){
        writers.add(writer);
    }

    public void DeleteWriter(Writer writer){
        writers.remove(writer);
    }

    public void DeleteArticle(Article article){
        articles.remove(article);
    }

    public Writer getWriter(String name){
        for (Writer writer : writers){
            if(Objects.equals(writer.getName(), name)){
                return writer;
            }
        }
        return null;
    }

    public void addArticle(Article article){
        articles.add(article);
    }

    public Article getArticle(String headline){
        for (Article article : articles){
            if(Objects.equals(article.getHeadline(), headline)){
                return article;
            }
        }
        return null;
    }
}
