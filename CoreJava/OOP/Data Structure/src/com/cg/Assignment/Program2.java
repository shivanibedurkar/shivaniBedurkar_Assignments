package com.cg.Assignment;

public class Program2 {

	public static void main(String[] args) {
		for (int n = 100; n <1000; n++) {
            int result=0;
            int org=n;
            while(org>0){
                int rem=org%10;
                result +=Math.pow(rem,3);
                org/=10;
            }
            if(n==result){
                System.out.println(n+" : Is an armstrong number ");
            }
        }

	}

}
