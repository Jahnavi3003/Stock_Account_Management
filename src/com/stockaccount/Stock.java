package com.stockaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

	static Scanner input = new Scanner(System.in);
	static ArrayList<StockPortfolio> stocks = new ArrayList<StockPortfolio>(); 

	
	public static ArrayList<StockPortfolio> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<StockPortfolio> stocks) {
		this.stocks = stocks;
	}

	
	public void enterNumOfStocks() {
		System.out.println("Enter how many stock you want :- ");
		int userChoice = input.nextInt();

		for (int i = 0; i < userChoice; i++) {
			addStock();
		}
	}

	public static void addStock() {
		System.out.println("Enter stock name :- ");
		String stock_name = input.next();

		System.out.println("Enter number of shares :- ");
		int num_of_shares = input.nextInt();

		System.out.println("Enter share price :- ");
		int share_price = input.nextInt();

		int stock_value = num_of_shares * share_price;

		StockPortfolio stock_add = new StockPortfolio(stock_name, num_of_shares, share_price, stock_value);
		stocks.add(stock_add);

		System.out.println("Stock is added successfully in your portfolio.\n");
	}

	
	public void displayStocks() {
		for (StockPortfolio stock : stocks) {
			System.out.println(stock.toString());
		}
		printTotalValueOfStocks();
	}

	
	public void printTotalValueOfStocks() {
		int total_value_of_stocks = 0;
		for (StockPortfolio stockPortfolio : stocks) {
			total_value_of_stocks += stockPortfolio.getStock_value();
		}
		System.out.println("Total value of stocks :- " + total_value_of_stocks);
	}

	
	public static void main(String[] args) {
		System.out.println("Welcome To Stock Account Management");

		Stock object = new Stock();
		object.enterNumOfStocks();
		object.displayStocks();
	}
}
	

