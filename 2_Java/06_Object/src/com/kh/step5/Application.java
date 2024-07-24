package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book("THE MONEY BOOK", 22000, 0.1, "토스");
		System.out.println(book1);
		
		Book book2 =new Book();
		book2.setTitle("허송세월");
		
		System.out.println(book2);
		book2.setTitle("허송세월");
		book2.setAuthor("김훈");
		book2.setPrice(18000);
		book2.setDiscountRate(0.2);
		
		System.out.println(book2);
		
		System.out.println(book2.getTitle());
		System.out.println(book1.getTitle());
		
		// 허송세월의 원래 가격은 18000원, 할인된 가격은 14400원
		// THE MONEY BOOK의 원래 가격은 22000원, 할인된 가격인 19800원
		System.out.println(book2.getTitle()+"의 원래 가격은 " + book2.getPrice() + "원, 할인된 가격은 "+ (int)(book2.getPrice()-(book2.getPrice() * book2.getDiscountRate())) +"원");
		System.out.println(book1.getTitle()+"의 원래 가격은 " + book1.getPrice() + "원, 할인된 가격은 "+ (int)(book1.getPrice()-(book1.getPrice() * book1.getDiscountRate())) +"원");
		
		
	}

}
