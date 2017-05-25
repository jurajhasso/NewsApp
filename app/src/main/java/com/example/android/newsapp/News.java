package com.example.android.newsapp;

/**
 * Created by XY on 24.5.2017.
 */

public class News {

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    private String title;

    private String section;

    private String webUrl;

    private String webPublicationDate;

    public News(String title, String section, String webUrl, String webPublicationDate) {
        this.title = title;
        this.section = section;
        this.webUrl = webUrl;
        this.webPublicationDate = webPublicationDate;
    }
}