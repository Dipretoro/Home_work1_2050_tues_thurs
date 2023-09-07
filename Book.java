/*
 * CS2050 - Computer Science II - Fall 2023

 * Instructor: Thyago Mota
 * Student:Andrew Dipretoro
 * Description: Homework 01 - Book
 */
import java.util.*;
public class Book {
	
	private String  title ;
	private String author;
	private  String genre ;
	private int numberOfPages;
	Scanner scan = new Scanner(System.in);
	private  String genreTester;
	private  int pageTester;
	private final int defaultNumPagesLow =10;
	private final int  defaultNUmPagesHigh=300;
	private final String defaultGenre="fiction";
	
	

	public Book (String title , String author , String genre, int numberOfPages) {
		this.title = title;
		this.author= author;
		this.genre= genre;
		this.numberOfPages= numberOfPages;
	}
	public static void main(String[] args) {
		Book book = new Book(null, null, null, 0);
		book.promptForAuthor_Title();
		book.promptForGenre();
		book.promptForNumberOfPages();
		book.toString();
		System.out.println(book);
	}
public boolean isLong() {
	if (numberOfPages >=defaultNUmPagesHigh) {
		return true ;
	}
	else	
	return false;
		
		
	}

@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", numberOfPages=" + numberOfPages
				+ "]";
	}

public  void promptForNumberOfPages() {
	
	System.out.println("please enter number of pages in the book "+ title);
	pageTester=scan.nextInt();
	if (pageTester<defaultNumPagesLow) {
		numberOfPages= defaultNumPagesLow;
	}
	else numberOfPages=pageTester;
	
		
		
	}

public void promptForGenre() {
		System.out.println("please enter the genre of the book ");
		genreTester=scan.nextLine();
		
		if(genreTester .equalsIgnoreCase("fiction")) {
			genre= "fiction";
			
		}
		else if(genreTester.equalsIgnoreCase("non-fiction")) {
			genre= "non-fiction";
			
		}
		else if(genreTester.equalsIgnoreCase("technical")) {
		genre="technical";
		}
		else if(genreTester.equalsIgnoreCase("biography")) {
			genre= "biography";
			
		}
		else 
			genre=defaultGenre;
				

			
		
				
			
			
		
	}
	

public  void promptForAuthor_Title() {
	
	System.out.println("please enter the title of the book ");
	title=scan.nextLine();
	System.out.println("please enter the author for the book "+" "+ title);
	author=scan.nextLine();
	
	
	
}




public  void setNumberOfPages(int numberOfPages) {
	this.numberOfPages = numberOfPages;
}
public int getNumberOfPages() {
	if (defaultNumPagesLow>numberOfPages) {
		numberOfPages=defaultNumPagesLow;
	
	return numberOfPages;
		}
	else return numberOfPages;
}

public  void setTitle(String title) {
	this.title = title;
}
public String  getTitle() {
	return title;
}

public void setAuthor(String author) {
	this.author = author;
}
public String getAuthor() {
	return author;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getGenre() {
	if(genre.equalsIgnoreCase("fiction")) {
		genre= "fiction";
		return genre;
		
	}
	else if(genre.equalsIgnoreCase("non-fiction")) {
		genre= "non-fiction";
		return genre;
		
	}
	else if(genre.equalsIgnoreCase("technical")) {
	return genre;
	}
	else if(genre.equalsIgnoreCase("biography")) {
		return genre;
		
	}
	else 
	genre=	defaultGenre;
	return genre;
}

}
