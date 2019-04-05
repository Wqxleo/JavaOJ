package com.hw06C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookList bl = new BookList();
		
		int n = s.nextInt();
		for (int i=0; i<n;i++) {
			bl.addBook(new Book(s.next(),
					s.nextInt(),
					s.next(),
					s.nextInt()));
		}
		bl.searchBook(new Book(s.next(),
					0,
					s.next(),s.nextInt()));
	}
}


class Book {
	private String name;
	private int price;
	private String writer;
	private int pnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", writer=" + writer + ", pnumber=" + pnumber + "]";
	}
	public Book(String name, int price, String writer, int pnumber) {
		super();
		this.name = name;
		this.price = price;
		this.writer = writer;
		this.pnumber = pnumber;
	}


}
class BookList{
	List<Book> booklist = new ArrayList();
	
	public void addBook(Book book) {
		booklist.add(book);
	}
	public void searchBook(Book book) {
		int flag = 0;
	
		for(int i = 0; i < booklist.size();i++) {
//			System.out.println(booklist.get(i));
			if((booklist.get(i).getName().equals(book.getName()))&&(booklist.get(i).getWriter().equals(book.getWriter()))&&(booklist.get(i).getPnumber()==book.getPnumber())) {
				flag = 1;
				System.out.println("found: "+i);
			}
		}
		if(flag == 0) {
			System.out.println("not found");
		}
	}
}