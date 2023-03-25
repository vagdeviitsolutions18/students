package com.vagdeviitstudents.naveen;

 interface Wipro {
	void work();
	void branch();
	void transport();
 }
  class Employee implements Wipro {
	  public void work() {
		 System.out.println("work from home");
		 System.out.println("work from office ");
	 }
	 
	  public void branch() {
		  System.out.println("Main branch ");  
	
		 }
	  public void transport() {
		  System.out.println("Two ways cab for night shift ");
		  System.out.println("one ways cab for Moring shift ");
	  }
	  public static void main(String[] args) {
		  Employee E1= new Employee();
			  E1.branch();
			  E1.transport();
	  }

}
