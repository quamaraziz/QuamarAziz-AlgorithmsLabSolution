package com.greatlearning.paymoneymain;

import java.util.Scanner;

import com.greatlearning.paymoneyservice.PayMoney;

public class PayMoneyMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PayMoney paymoney = new PayMoney();
//		int targetCount = 0;
		
		System.out.println("Enter the size of the transaction array : ");
		int arrSize = sc.nextInt();
		
		System.out.println("Enter the value of the array : ");
		int arr [] = new int[arrSize];
		for(int i = 0; i<arrSize ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that need to be achieved :");
		int targetCount = sc.nextInt();
		System.out.println();

		paymoney.findTarget(targetCount, arr);
		sc.close();

	}

}
