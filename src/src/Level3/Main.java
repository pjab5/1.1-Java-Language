package src.Level3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        String name, DNI, headline;
        Scanner read = new Scanner(System.in);
        read.useDelimiter("\r?\n");
        EditorialStaff editorialStaff = new EditorialStaff(new ArrayList<Writer>(),new ArrayList<Article>());
        do{
            System.out.println("\n\nChoose one of the following options: ");
            System.out.println("    1.-Add writer.");
            System.out.println("    2.-Delete writer.");
            System.out.println("    3.-Add article to writer.");
            System.out.println("    4.-Delete article.");
            System.out.println("    5.-Display all articles by writer.");
            System.out.println("    6.-Get article punctuation.");
            System.out.println("    7.-Get price per article.");
            System.out.println("    8.-Exit");
            option = read.nextInt();
            switch (option){
                case 1:
                    System.out.println("What is the writer's name?");
                    name = read.next();
                    System.out.println("What is the writer's DNI?");
                    DNI = read.next();
                    editorialStaff.AddWriter(new Writer(name,DNI));
                    break;
                case 2:
                    System.out.println("Which writer do you want to delete?");
                    name = read.next();
                    if (editorialStaff.getWriter(name) != null){
                        editorialStaff.DeleteWriter(editorialStaff.getWriter(name));
                        System.out.println(name + " has been deleted");
                    }else{
                        System.out.println("This writer is not on the Editorial Staff.");
                    }
                    break;
                case 3:
                    System.out.println("What's the name of the writer?");
                    name = read.next();
                    if (editorialStaff.getWriter(name) == null){
                        System.out.println("This writer is not on the Editorial Staff.");
                        break;
                    }
                    System.out.println("About which sport is the article by " + name + "?" );
                    String type = read.next();
                    System.out.println("What is the headline of the article you want to add to " + name + "?" );
                    headline = read.next();
                    System.out.println("What are the contents of the article you want to add to " + name + "?" );
                    String text = read.next();
                    if(Objects.equals(type, "Football")){
                        System.out.println("Which competition?");
                        String competition = read.next();
                        System.out.println("Which club?");
                        String club = read.next();
                        System.out.println("Which player?");
                        String player = read.next();
                        Football football = new Football(headline,text,competition,club,player);
                        editorialStaff.getWriter(name).addArticle(football);
                        editorialStaff.addArticle(football);
                    } else if (Objects.equals(type, "Basketball")) {
                        System.out.println("Which competition?");
                        String competition = read.next();
                        System.out.println("Which club?");
                        String club = read.next();
                        Basketball basketball = new Basketball(headline,text,competition,club);
                        editorialStaff.getWriter(name).addArticle(basketball);
                        editorialStaff.addArticle(basketball);
                    } else if (Objects.equals(type, "Tennis")) {
                        System.out.println("Which competition?");
                        String competition = read.next();
                        System.out.println("Which player?");
                        String player = read.next();
                        Tennis tennis = new Tennis(headline,text,competition,player);
                        editorialStaff.getWriter(name).addArticle(tennis);
                        editorialStaff.addArticle(tennis);
                    } else if (Objects.equals(type, "F1")) {
                        System.out.println("Which team?");
                        String team = read.next();
                        F1 f1 = new F1(headline,text,team);
                        editorialStaff.getWriter(name).addArticle(f1);
                        editorialStaff.addArticle(f1);
                    } else if(Objects.equals(type, "Motorcycle Racing")){
                        System.out.println("Which team?");
                        String team = read.next();
                        MotorcycleRacing motorcycleRacing = new MotorcycleRacing(headline,text,team);
                        editorialStaff.getWriter(name).addArticle(motorcycleRacing);
                        editorialStaff.addArticle(motorcycleRacing);
                    }else{
                        System.out.println("Choose another sport.");
                }
                    break;
                case 4:
                    System.out.println("Who is the writer of the article you want to delete?");
                    name = read.next();
                    if (editorialStaff.getWriter(name) == null){
                        System.out.println("This writer is not on the Editorial Staff.");
                        break;
                    }
                    System.out.println("What is the headline?" );
                    headline = read.next();
                    if (editorialStaff.getArticle(headline) == null){
                        System.out.println("This article doesn't exist.");
                        break;
                    }
                    editorialStaff.getWriter(name).deleteArticle(editorialStaff.getArticle(headline));
                    editorialStaff.DeleteArticle(editorialStaff.getArticle(headline));
                    System.out.println("The article with the headline ["+ headline + "] has been deleted");
                    break;
                case 5:
                    System.out.println("Whose articles do you want to be displayed?");
                    name = read.next();
                    if (editorialStaff.getWriter(name) == null){
                        System.out.println("This writer is not on the Editorial Staff.");
                        break;
                    }
                    System.out.println(name + "'s articles: ");
                    System.out.println(editorialStaff.getWriter(name).getArticles());
                    break;
                case 6:
                    System.out.println("What is the headline?" );
                    headline = read.next();
                    if (editorialStaff.getArticle(headline) == null){
                        System.out.println("This article doesn't exist.");
                        break;
                    }
                    System.out.println("The punctuation is: " + editorialStaff.getArticle(headline).getArticlePunctuation());
                    break;
                case 7:
                    System.out.println("What is the headline?" );
                    headline = read.next();
                    if (editorialStaff.getArticle(headline) == null){
                        System.out.println("This article doesn't exist.");
                        break;
                    }
                    System.out.println("The price is: " + editorialStaff.getArticle(headline).getArticlePrice());
                    break;
            }
        }while(option!=8);
        System.out.println("Until next time!");
    }


}


