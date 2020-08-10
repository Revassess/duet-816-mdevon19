package com.revature.tier1;

import java.util.stream.*;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int sum = IntStream.of(arr).sum();

		return sum;
	}
}
