package com.vagdeviitstudents.naveen.collections;

import java.util.ArrayList;

import java.util.Iterator;

import com.vagdeviitstudents.naveen.collections.*;


public class CollecectionList {
	
	ArrayList merge(ArrayList Students,ArrayList Teachers)
	{
		ArrayList total=new ArrayList();
		total.addAll(Students);
		total.addAll(Teachers);
		return total;
	}
	
	public static void main(String[] args) 
	{
		ArrayList st=new ArrayList ();
		Students s1 = new Students("ravi", 22);
		Students s2 = new Students("raju", 22);
		Students s3 = new Students("naveen", 29);
		Students s4 = new Students("anna", 15);

	
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		 
        ArrayList t=new ArrayList();
		Teachers t1 = new Teachers("John", 10, 20);
		Teachers t2 = new Teachers("Jane", 20, 30);
		Teachers t3 = new Teachers("Bob", 15, 25);

		t.add(t1);
		t.add(t2);
		t.add(t3);

	 
	    
		CollecectionList cl=new CollecectionList();
		ArrayList al=cl.merge(st,t);
			
		
			Iterator itr = al.iterator();
			while (itr.hasNext()) {
			Students ts = (Students) itr.next();

				System.out.println(ts);
			}

	       
		
	}

	
	
	
	

}
