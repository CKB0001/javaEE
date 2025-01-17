package com.beans;
import java.io.*;

public class BookBean implements Serializable{
    private String bookid = null;
    private String title = null;
    private String author = null;
    private String publisher = null;
    private float price = 0.0F;

    public BookBean(){}
    public BookBean(String bookId, String author, 
                       String title, String publisher, float price) {
        this.bookid = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
this.price = price;
    }
    public String getBookid() { return this.bookid; }
    public String getTitle() { return title; }
    public String getAuthor() { return this.author; }
    public float getPrice() { return price; }
    public String getPublisher () { return publisher; }
    
    public void setBookid(String bookid){ this.bookid=bookid;	}
    public void setTitle(String title){this.title=title;	}
    public void setAuthor(String author){ this. author = author;	}
    public void setPrice(float price){this.price=price;	}
    public void setPublisher (String publisher){ this.publisher = publisher;}
}