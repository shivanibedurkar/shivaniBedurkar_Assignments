package com.cg.program1;

public class Contact {
	private Long phoneNumber;
	  private String name;
	  private String email;
	  private Gender gender;

	  public Contact(Long phoneNumber,String name,String email,Gender gender){
	      this.phoneNumber=phoneNumber;
	      this.name=name;
	      this.email=email;
	      this.gender=gender;
	  }
	  @Override
	  public String toString() {
	      // TODO Auto-generated method stub
	      return "name: "+name+" Phone no: "+phoneNumber+" email: "+email;
	  }
}
