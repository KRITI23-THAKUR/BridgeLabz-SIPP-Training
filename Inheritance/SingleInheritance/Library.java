package SingleInheritance;

import java.nio.file.spi.FileSystemProvider;

class Book {
	 String title;
	 int publicationYear;
	Book(String title,int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
		 
	 }
	void displayInfo() {
		System.out.println("Book: " + title + "\nyear: " + publicationYear);
	}
	

}
 
 class Author extends Book{
	 String name;
	 String bio;
	public Author(String title,int publicationYear,String name,String bio){
		 super(title,publicationYear);
		 this.name=name;
		 this.bio=bio;
	 }
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Name: "+ name + "\nbio: "+ bio);
	}
 }
 
 
 public class Library{
	 public static void main(String[] args) {
		Book b1 = new Author("Game of Thrones",2011,"George R.R Martin","A Game of Thrones is the first novel in A Song of Ice and Fire, a series of fantasy novels by American author George R. R. Martin.");
	b1.displayInfo();
	 }
 }