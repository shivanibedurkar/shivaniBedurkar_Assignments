package com.cg.program4;

import java.util.Date;

public class Program4_2 {
	
		public static void main(String[] args) {

		Date objc = new Date();
		Pair<String, java.util.Date> object = new Pair<String, java.util.Date>("1", objc);
		System.out.println("{" + object.getObj1() + "=" + object.getObj2() + "}");
	}
}
