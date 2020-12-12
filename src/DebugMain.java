import news.actors.Editor;
import news.NewsArticle;
import news.NewsSystem;
import news.actors.Reader;

public class DebugMain {

    public static void main(String[] args) {

        NewsSystem newsSystem = new NewsSystem();
        /*
        NewsArticle newsArticle1 = new NewsArticle(
                "Alegeri pe 6 Decembrie",
                "Ilie Iliescu",
                "Politica"
        );
        NewsArticle newsArticle2 = new NewsArticle(
                "Stadionul Dan Paltinisanu se inchide",
                "Paul Popescu",
                "Sport"
        );
        NewsArticle newsArticle3 = new NewsArticle(
                "Stadionul Dan Paltinisanu se deschide",
                "Paul Popescu",
                "Sport"
        );


        Editor editor = new Editor(newsSystem);

        Reader reader1 = new Reader(newsSystem);
        Reader reader2 = new Reader(newsSystem);
        reader2.subscribe("Sport");

        editor.addNewsArticle(newsArticle1);

        reader1.subscribe(newsArticle1);
        editor.addNewsArticle(newsArticle2);
        editor.addNewsArticle(newsArticle3);

        editor.updateNewsArticle(newsArticle1);

        reader1.readNewsArticle(newsArticle1);
        reader1.readNewsArticle(newsArticle1);
        reader1.readNewsArticle(newsArticle2);
        reader1.readNewsArticle(newsArticle1);
        reader1.readNewsArticle(newsArticle2);
        reader2.readNewsArticle(newsArticle1);
        reader2.readNewsArticle(newsArticle1);
        */

        newsSystem.start();

        Editor editor1 = new Editor(newsSystem);
        Editor editor2 = new Editor(newsSystem);

        Reader reader1 = new Reader(newsSystem);
        Reader reader2 = new Reader(newsSystem);
        Reader reader3 = new Reader(newsSystem);
        Reader reader4 = new Reader(newsSystem);

        editor1.start();
        editor2.start();

        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();
    }

}
