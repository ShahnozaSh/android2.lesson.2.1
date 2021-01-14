package com.example.android2lesson21.models;

import java.io.Serializable;

public class Note implements Serializable {

    private String title;
    private String date;

    public Note(String title, String date) {
      this.title = title;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


   public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
