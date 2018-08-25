package com.example.android.newsapp;

public class News {

    //news section
    private String mSection;

    //time news was published
    private String mTime;

    //news title
    private String mTitle;

    private String mContributor;

    //website url of the news
    private String mUrl;

    //constructor
    News(String section, String time, String title, String contributor, String url) {
        mSection = section;
        mTime = time;
        mTitle = title;
        mContributor = contributor;
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

    //get contributors name
    public String getContributor() {
        return mContributor;
    }

    public String getUrl() {
        return mUrl;
    }

}
