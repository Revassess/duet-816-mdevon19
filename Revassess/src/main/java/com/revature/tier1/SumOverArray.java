package com.revature.tier1;

import java.util.stream.*;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr==null){
			return 0;
		}

		int sum = 0;

		sum = IntStream.of(arr).sum();

		return sum;
	}
}
