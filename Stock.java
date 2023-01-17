package com.bridzelabz.stockAccountManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	static ArrayList <Stock> array = new ArrayList<Stock>();

	static Scanner sc = new Scanner(System.in);


	public void insertStocks() {
		System.out.println("How much stock you want to insert ..!");
		int numberOfStock = sc.nextInt();
		System.out.println("Insert stock name and stock prise  ");
		for (int i = 1; i <= numberOfStock; i++) {
			sc.nextLine();
			String stockName = sc.nextLine();
			int stockPrice = sc.nextInt();
			array.add(new Stock());
		}
	}
	public void displayStocks(){
		for(Stock stock : array){
			System.out.println(stock.getNumberOfShares()+", "+stock.getStockName()+", "
			+ ""+stock.getSharePrize());
		}
	}				
	private String getNumberOfShares() {
		// TODO Auto-generated method stub
		return null;
	}
	public void buyShares(){
		int totalValue = 0;
		// ArrayList <Stock> array1 = new ArrayList<Stock>();
		System.out.println("How much stock you want to buy ..!");
		int numberOfStock = sc.nextInt();
		String nameOfStock;
		int quantity=0;
		for (int i =1;i<= numberOfStock; i++){
			System.out.println("Enter "+i+ " Share Name and Quantity of Share's ");
			sc.nextLine();
			nameOfStock = sc.nextLine();
			quantity = sc.nextInt();
			for (Stock arrayStock:array ){	
				if (arrayStock.getStockName().equals(nameOfStock)){
					totalValue +=((quantity)*arrayStock.getSharePrize());
				}
			}
		}
		System.out.println("Total values of shares is "+totalValue);
	}
	private int getSharePrize() {
		// TODO Auto-generated method stub
		return 0;
	}
	private Object getStockName() {
		// TODO Auto-generated method stub
		return null;
	}
	 

}
	