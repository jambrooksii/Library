package com.company;

public class Libary {

    int numberOfBooks = 0;
    String titlesOfBook;

   public Book bookArray[] = new Book[7];
    //Book connectBooks = new Book();






    public int numberOfBooksInLibary(int numBooks) {
        numberOfBooks = numBooks;
        return numberOfBooks;
    }

    public String bookTitles(String titlesOfBook){
        this.titlesOfBook = titlesOfBook;
        return titlesOfBook;
    }

}
