package com.cg.Assignment;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		System.out.println("sorted elements are: ");
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] < x[i]) {
					int temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}

}
