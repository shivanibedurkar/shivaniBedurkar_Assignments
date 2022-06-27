package com.cg.Program6;
public class Program6 {

	public static void main(String[] args) {
		
		Persistence obj= new Persistence() {
            @Override
            public void persist() {
                System.out.println("calling it");
            }
        };
        obj.persist();

	}

}
