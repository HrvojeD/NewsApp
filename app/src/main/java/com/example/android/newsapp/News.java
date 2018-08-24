package com.example.android.newsapp;

public class News {

    //news section
    private String mSection;

    //time news was published
    private String mTime;

    //news title
    private String mTitle;

    //website url of the news
    private String mUrl;

    //constructor
    News(String section, String time, String title, String url) {
        mSection = section;
        mTime = time;
        mTitle = title;
        mUrl = url;
    }

    //get name of the section
    public String getSection() {
        return mSection;
    }

    //get time news was published
    public String getTime() {
        return mTime;
    }

    //get news title
    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

}
