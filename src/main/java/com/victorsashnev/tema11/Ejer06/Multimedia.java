package com.victorsashnev.tema11.Ejer06;

import java.util.GregorianCalendar;

public abstract class Multimedia {
    public enum TYPE {
        CD,DVD,BLU_RAY,ARCHIVE
    }
    private final String title;
    private final String author;
    private final TYPE format;
    private final GregorianCalendar calendar;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public TYPE getFormat() {
        return format;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public Multimedia(String title, String author, TYPE format, GregorianCalendar calendar) {
        this.title = title;
        this.author = author;
        this.format = format;
        this.calendar = calendar;
    }

    public boolean confirmMedia(String author, String title){
        return this.author.equalsIgnoreCase(author) && this.title.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", format=" + format +
                ", calendar=" + calendar +
                '}';
    }
}
