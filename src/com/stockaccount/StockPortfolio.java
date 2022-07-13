package com.stockaccount;

public class StockPortfolio {
	
	String stock_name;
	int num_of_shares;
	int share_price;

	int stock_value;

	public StockPortfolio(String stock_name, int num_of_shares, int share_price, int stock_value) {
		this.stock_name = stock_name;
		this.num_of_shares = num_of_shares;
		this.share_price = share_price;
		this.stock_value = stock_value;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getNum_of_shares() {
		return num_of_shares;
	}

	public void setNum_of_shares(int num_of_shares) {
		this.num_of_shares = num_of_shares;
	}

	public int getShare_price() {
		return share_price;
	}

	public void setShare_price(int share_price) {
		this.share_price = share_price;
	}

	public int getStock_value() {
		return stock_value;
	}

	public void setStock_value(int stock_value) {
		this.stock_value = stock_value;
	}

	
	@Override
	public String toString() {
		return ("Stock name :- " + getStock_name() + " and number of shares :- " + getNum_of_shares() + "\n"
				+ "          			share price :- " + getShare_price() + "\n"
				+ "          			value of stock :- " + getStock_value());
	}

}
