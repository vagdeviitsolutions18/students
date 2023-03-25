package com.vagdeviitstudents.naveen;

 abstract class Employe {
    int a=20;
    public void Name() {
    	System.out.println("Name of the Employe ");
    	
    }
    abstract void Department();
    
    abstract void work();
    
    
    public void login() {
    	System.out.println("employe login time ");	
   }
     class Test extends Employe {
    	void Department() {
    		System.out.println("Name of the Depatmnet ");
    	}
    	void work() {
    		System.out.println("work of the Employe ");
    	}
    	public static void main(String[] args) {
    		
//            Test t1 = new Test();
//            
//            t1.Name();
//    		t1.Department();
//    		t1.work();
    		
    	}
    	
    }
}
