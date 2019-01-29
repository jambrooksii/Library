package com.company;

public class Book {
    String author;
    String title;
    String genre;
    int numOfPages;

    public Book(String author, String title, String genre, int numOfPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

  /*  public tempMethod(String author, String title, String genre, int numOfPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numOfPages = numOfPages;

      //  System.out.println("You added " + title + " by " + author + " it is a " + genre + " and has " + numOfPages + " pages ");
    }*/

    Book bookArray[] = new Book[50];




    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String bookGenre) {
        genre = bookGenre;
    }

    public String getGenre() {
        return genre;
    }

    public void setNumOfPages(int bookNumOfPages) {
        numOfPages = bookNumOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
