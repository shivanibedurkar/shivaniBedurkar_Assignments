package com.cg.string;

public class Program3 {

	public static void main(String[] args) {

		String string1 = "Java String pool refers to the collection of "
					+ "Strings which are stored in heap memory";

	
		String string2 = string1.toLowerCase();
		System.out.println("Lowercase : " + string2);

		String string3 = string2.toUpperCase();
		System.out.println("Upper case : " + string3);

		String replaceString = string1.replace('a', '$');
		System.out.println("Replaced string : " + replaceString);
	
		if (string1.contains("collection")) {
			System.out.println("collection word found in string");
		} else {
			System.out.println("collection word is not found in string");
		}

		// matches
		System.out.print("Return Value :");
		System.out.println(string1.matches("Java String pool refers to the " 
		+ "collection of Strings which are stored in heap memory"));
	}
}
