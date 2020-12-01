package news;

import events.Event;

public class NewsEvent extends Event {

    // For filters to work properly, we need information about newsArticle

    private NewsArticle newsArticle;

    protected NewsEvent(Type type, NewsArticle newsArticle) {
        super(type);
        this.newsArticle = newsArticle;
    }

    public NewsArticle getNewsArticle() {
        return newsArticle;
    }
}