package com.company;

/*Create a new class named Book and give it at least (4) properties (such as title, author, number of pages, etc.).
        Create getter & setter methods for each variable. Create a printDetails() method which will display
        all available information about a Book object.

        Create a new class named Library and give it (1) property: an array of Book objects. Library should have a
        numberOfBooksInLibrary() method which displays how many Books the user has in their Library.

        In a class named BookDemo, give the user (3) options: they can see how many books they have, add a book
        to their Library, or exit the program. If they choose to add a book, they should be prompted to enter
        all the necessary details about each book. The user should be able to add as many books as they want,
        and view the number of books in their library as often as they wish.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        // write your code here

        Libary libBooks = new Libary();

        Book Book1 = new Book("Stephen King", "The Stand", "Horror", 700);
        libBooks.bookArray[0] = Book1;
        //  System.out.println( Book1.author + "\n" + Book1.title + "\n" + Book1.genre + "\n" + Book1.numOfPages);

        Book Book2 = new Book("Dean Koontz", "Odd Thomas", "Suspense", 1000);
        libBooks.bookArray[1] = Book2;
        //   System.out.println( Book2.author + "\n" + Book2.title + "\n" + Book2.genre + "\n" + Book2.numOfPages);

        Book Book3 = new Book("C.S. Lewis", "The Lion The Witch and The WarDrobe", "Fantasy", 400);
        libBooks.bookArray[2] = Book3;
        //  System.out.println( Book3.author + "\n" + Book3.title + "\n" + Book3.genre + "\n" + Book3.numOfPages);

        Book Book4 = new Book("J.K. Rowling", "Harry Potter", "Fantasy", 500);
        libBooks.bookArray[3] = Book4;
        //System.out.println( Book4.author + "\n" + Book4.title + "\n" + Book4.genre + "\n" + Book4.numOfPages);

        // System.out.println("The Authors in your library are \n" + Book1.author + "\n" + Book2.author + "/n" + Book3.author + "\n"
        //                    + Book4.author);
        int bookCounter = 0;

        int counter = 4;
        boolean again = false;
        int goAgain;
        boolean play = false;
        int choice = 1;

        do {

            Scanner newScan = new Scanner(System.in);
            Scanner scanNew = new Scanner(System.in);
            System.out.println("Welcome to the Libary, What would you like to do?" + "\n" + "Click [1] Add Books " + "\n" + "Click [2] Check Out Books" + "\n" + "Click [3] See List Of Books" +
                    "\n" + "Click [4] Exit");

            int userInput = newScan.nextInt();


            switch (userInput) {
                case 1:
                    do {
                        System.out.print("Please enter the name of the book you want to add");
                        String userTitle = scanNew.nextLine();


                        System.out.print("Please enter the genre of the book ");
                        String userGenre = scanNew.nextLine();


                        System.out.print("Please enter the Author of the book ");
                        String userAuthor = scanNew.nextLine();


                        System.out.print("Please Enter Number of Pages ");
                        int userNumPages = newScan.nextInt();


                        counter++;

                        libBooks.numberOfBooksInLibary(counter);
                        libBooks.bookTitles(userTitle);

                        System.out.println("You Have " + counter + " in your Libary ");

                        Book Book5 = new Book(userAuthor, userTitle, userGenre, userNumPages);


                        for (int i = 4; i <= libBooks.bookArray.length; i++) {
                            libBooks.bookArray[i] = Book5;
                            System.out.println("The Book You Added is \n" + libBooks.bookArray[i].author + "\n" +
                                    libBooks.bookArray[i].title + "\n" + libBooks.bookArray[i].genre + "\n" +
                                    libBooks.bookArray[i].numOfPages);
                            break;
                        }


                        // libBooks.bookArray[bookCounter] = connectBooks;

                        bookCounter++;


                        System.out.println("Do you want to add another book ? [1] for Yes \n [2] for No");
                        userInput = newScan.nextInt();
                        if (userInput == 1) {
                            again = true;
                        } else if (userInput == 2) {
                            again = false;
                        }


                    } while (again == true);

                    break;

                case 2:

                    System.out.println("You Have  " + counter + "books in you libiary");

                    System.out.println("Press [1] to View Books by Title " +
                            " \n Press [2] to View Books by Author");

                    int userLibiraryInput = scanNew.nextInt();


                    if (userLibiraryInput == 1) {
                        for (int i = 0; i < libBooks.bookArray.length; i++) {
                            if (libBooks.bookArray[i] != null)
                                System.out.println(libBooks.bookArray[i].title);
                        }
                    } else if (userLibiraryInput == 2) {
                        for (int i = 0; i < libBooks.bookArray.length; i++) {
                            if (libBooks.bookArray[i] != null)
                                System.out.println(libBooks.bookArray[i].author);
                        }

                    }

                    System.out.println("Do you want to go back to the main menu \n Press [1] for Yes \n Press [2] for No");
                    goAgain = scanNew.nextInt();
                    if (goAgain == 1) {
                        play = true;
                    } else if (goAgain == 2) {
                        play = false;
                    }
                case 3:
                    System.out.println("Thank You for Visiting");
                    play = false;

            }


        } while (play == true);
    }
}
