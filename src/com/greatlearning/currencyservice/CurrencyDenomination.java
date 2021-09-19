package com.greatlearning.currencyservice;

public class CurrencyDenomination {

	public void currencyCount(int[] currencyArr, int amount) {
		int arr[] =Sort.sort(currencyArr, 0, currencyArr.length-1);
		int counter[] = new int[arr.length];
//		for(int i = 0 ; i < arr.length; i++) {
//			System.out.print(arr[i]+", ");		
//		}

		for(int i = 0 ; i < arr.length; i++) {
			if(amount >= arr[i]) {
				counter[i] = amount / arr[i];
				amount -= arr[i]*counter[i];
			}			
		}
		
		if(amount > 0) {
			System.out.println("Exact amount cannot be given with the highest denomination");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i =0 ; i<arr.length; i++) {
				if(counter[i]!= 0 ) {
					System.out.println(arr[i]+" : " + counter[i]);
				}
			}
		}
	}

}
