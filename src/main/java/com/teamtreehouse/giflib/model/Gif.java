package com.teamtreehouse.giflib.model;

import java.time.LocalDate;

/**
 * Created by jianjunliu on 2017-09-10.
 */

//Gif is a Plain old java object (POJO) that can hold Data
//Have 5 things:
//Model: holds Data (store data into a model object)  eg. Gif
//View
//Controller
//Resource: in resources repo
//Data: digital representation of info (in data repo)

public class Gif {
    private String name;
    private int categoryId;
    private LocalDate dateUploaded;  //import class in intellij: alt+enter
    private String userName;
    private boolean favorite;

    public Gif(String name, int categoryId, LocalDate dateUploaded, String userName, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
