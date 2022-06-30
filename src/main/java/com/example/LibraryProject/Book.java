package com.example.LibraryProject;

public class Book {
    private int number;
    private String title;
    private String author;
    private String genre;
    private String subgenre;
    private String publisher;

    public Book(int number, String title, String author, String genre, String subgenre, String publisher) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.subgenre = subgenre;
        this.publisher = publisher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString(){
        return "Book{" +
                "number= " + number +
                ", title= " + title +
                ", author= " + author +
                ", genre= " + genre +
                ", subgenre= " + subgenre +
                ", publisher= " + publisher +
                "}";
    }


}
