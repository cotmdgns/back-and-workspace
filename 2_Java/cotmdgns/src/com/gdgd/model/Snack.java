package com.gdgd.model;

public class Snack {
	
	private String kind;
	private String name;
	private String flaover;
	private int numOf;
	private int price;
	
	public Snack() {

	}

	public Snack(String kind, String name, String flaover, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flaover = flaover;
		this.numOf = numOf;
		this.price = price;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getFlaover() {
		return flaover;
	}

	public void setFlaover(String flaover) {
		this.flaover = flaover;
	}
	
	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}





	@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flaover=" + flaover + ", numOf=" + numOf + ", price="
				+ price + "]";
	}
	
	
	
}
