package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		int len = Long.toString(num).length();
		int[] arr = new int[len];

		for (int index = 0; index < len; index++) {
			arr[index] = len % 10;
			len /= 10;
		}










		return false;
	}
}
