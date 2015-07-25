/*
 * MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 4: Library
 * This file is a class that simulates a library
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */ 

import java.util.*;

public class Library 
{
	String libraryAddress;
	ArrayList<Book> books;
	
	
    public Library(String address)
    {
    	libraryAddress = address;
    	books = new ArrayList<Book>();
    }
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public void printAddress()
	{
		System.out.println(libraryAddress);
	}
	
	// This method checks the books ArrayList to see if the book with the title exists.
	// if it does and it's not borrowed, it borrows it and alerts the user they've successfully checked it out.
	// If it does exists and its borrowed, it alerts the user that the book is already borrowed.
	// If the book does not exist in the library, the user is alerted.
	// My reason for making the return type of this method not void is so that I could immediately exit the method
	// if the book was found in the library. The fact that it's a String is arbitrary; it could have been any data type
	// since I return null for any case.
	public String borrowBook(String bookTitle)
	{		
		Book libraryBook;
		String libraryBookTitle;
		
		for(int i = 0; i < books.size(); i+=1)
		{
			libraryBook = books.get(i);
			libraryBookTitle = libraryBook.getTitle();
			
			if(libraryBookTitle.equals(bookTitle))
			{
				if(!(libraryBook.isBorrowed()))
				{
					libraryBook.borrowed();
					System.out.println("You successfully borrowed " + libraryBookTitle);
					return null;
				}
				else
				{
					System.out.println("Sorry, this book is already borrowed.");
					return null;
				}
			}
		}
		
		System.out.println("Sorry, this book is not in our catalog.");
		return null;
	}
	
	// This method walks through the books ArrayList and prints the title
	// of any book object that is not borrowed. If the library is empty or
	// all of the books are checked out, it will alert the user.
	public void printAvailableBooks()
	{
		Book libraryBook;
		boolean libraryIsEmpty = true;
		
		for(int i = 0; i < books.size(); i+=1)
		{
			libraryBook = books.get(i);
			
			if(!(libraryBook.isBorrowed()))
			{
				System.out.println(libraryBook.getTitle());
				libraryIsEmpty = false;
			}
		}
		
		if(libraryIsEmpty)
		{
			System.out.println("No books in catalog.");
		}
	}
	
	// This method walks through the books ArrayList, searching for the input bookTitle.
	// When found, the book object will be returned and the user will be notified. If the 
	// book is not found in the library, the user will be alerted.
	public void returnBook(String bookTitle)
	{
		Book libraryBook;
		String libraryBookTitle;
		Boolean found = false;
		
		for(int i = 0; i < books.size(); i+=1)
		{
			libraryBook = books.get(i);
			libraryBookTitle = libraryBook.getTitle();
			
			if(libraryBookTitle.equals(bookTitle))
			{
				if(libraryBook.isBorrowed())
				{
					libraryBook.returned();
					System.out.println("You successfully returned " + libraryBookTitle);
					found = true;
					break;
				}
			}
		}
		
		if(!found)
		{
			System.out.println("Your book was not fond in the library catalog.");
		}
	}
	
	public static void printOpeningHours()
	{
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	
    public static void main(String[] args) 
    {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        //Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 