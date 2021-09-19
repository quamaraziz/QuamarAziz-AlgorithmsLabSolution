package com.greatlearning.currencymain;

import java.util.Scanner;

import com.greatlearning.currencyservice.CurrencyDenomination;

public class CurrencyDenominationMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CurrencyDenomination currencyDenomination = new CurrencyDenomination();
		int currencyArr[];
		
		System.out.println("Enter the size of currency denomination :");
		int denominationSize = sc.nextInt();
		currencyArr = new int[denominationSize];
		
		System.out.println("Enter the currency denomination value :");
		for(int i =0 ; i < denominationSize ; i++) {
			currencyArr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		int amount = sc.nextInt();
		
		currencyDenomination.currencyCount(currencyArr, amount );
		
		sc.close();
		

	}

}
