package com.greatlearning.paymoneyservice;

import java.util.Scanner;

public class PayMoney {
	
	Scanner sc = new Scanner(System.in);
	
	public void findTarget(int targetCount, int[] arr) {
		for(int i =0; i< targetCount ; i++) {
			System.out.println("Enter the Value of the target :");
			int targetVal = sc.nextInt();
			int sum= 0 ;
			int j = 0;
			while(j<arr.length) {
				sum += arr[j];
				if(sum>= targetVal) {
					System.out.printf("Target achieved after "+ (j+1)+" transactions\n");
					break;
				}
				else if(sum<targetVal && j==arr.length-1) {
					System.out.println("Given Target is not achieved");
					System.out.println();
				}
				j++;
			}
		}
		
	}
	

}
