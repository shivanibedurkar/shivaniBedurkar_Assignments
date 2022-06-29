package com.cg.program1;

public class SingleTone {

	private static SingleTone singleTone = null;

	private SingleTone() {

	}

	public static SingleTone getInstance() {

		if (singleTone == null) {
			singleTone = new SingleTone();
		}

		return singleTone;
	}

		//	public void getSingleTone() {
		//		System.out.println("Single tone cls");
		//	}
		public static void main(String[] args) {
		SingleTone obj1 = SingleTone.getInstance();
		System.out.println(obj1);

		SingleTone obj2 = SingleTone.getInstance();
		System.out.println(obj2);
	}

}
