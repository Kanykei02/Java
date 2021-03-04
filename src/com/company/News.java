package com.company;

import java.util.Date;

public class News {
    private int newsId;
    private String newsHeadline;
    private String newsText;
    private Date publicationTime;

    public News(){}

    public News(int newsId, String newsHeadline, String newsText, Date publicationTime) {
        this.newsId = newsId;
        this.newsHeadline = newsHeadline;
        this.newsText = newsText;
        this.publicationTime = publicationTime;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsHeadline() {
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline) {
        this.newsHeadline = newsHeadline;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
}
