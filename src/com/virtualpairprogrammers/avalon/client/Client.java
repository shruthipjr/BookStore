package com.virtualpairprogrammers.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.avalon.domain.Book;
import com.virtualpairprogrammers.avalon.services.BookService;
import com.virtualpairprogrammers.avalon.services.PurchasingService;

public class Client 
{
	public static void main(String[] args)
	{
		System.out.println("testing buying a book");
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		
		 PurchasingService purchasingService = container.getBean(PurchasingService.class);
		 
		 PurchasingService purchasingService1 = container.getBean(PurchasingService.class);
		 PurchasingService purchasingService2= container.getBean(PurchasingService.class);
		 PurchasingService purchasingService3 = container.getBean(PurchasingService.class);
		 PurchasingService purchasingService4 = container.getBean(PurchasingService.class);
		
//		List<Book> allBooks = bookService.getEntireCatalogue();
//		
//		for(Book next: allBooks){
//			System.out.println(next);
//		}
		 purchasingService.buyBook("ISBN1");
		 
		 container.close();
		 
	}
}
