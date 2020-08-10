package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int sum1 = 0;


		for (int i = 0; i < arr.length; i++){
			sum1 = sum1 + arr[i];
		}

		return sum1;
	}
}
